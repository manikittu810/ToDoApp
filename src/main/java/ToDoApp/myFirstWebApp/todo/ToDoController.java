package ToDoApp.myFirstWebApp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

import static ToDoApp.myFirstWebApp.todo.ToDoService.*;

@Controller
@SessionAttributes("name")
public class ToDoController {
    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        super();
        this.toDoService = toDoService;
    }

    @RequestMapping("list-todos")
    public String listAllToDos(ModelMap model){
        List<ToDo> todos =toDoService.findByUserName("smk");
        model.addAttribute("todos",todos);
        return "listToDos";
    }

    @RequestMapping(value="add-todo",method = RequestMethod.GET)
    public String ShowNewTodoPage() {
        return "todo";
    }


    @RequestMapping(value="add-todo",method = RequestMethod.POST)

    public String addNewTodo(@RequestParam String description,ModelMap model){

    String username=(String)model.get("name");

    ToDoService.addToDo(username,description,
            LocalDate.now().plusYears(1) ,false);

        return "redirect:list-todos";

    }
}

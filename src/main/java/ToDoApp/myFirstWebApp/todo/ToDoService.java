package ToDoApp.myFirstWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class ToDoService {
    private static List<ToDo> toDos=new ArrayList<>();
    static{
        toDos.add(new ToDo(1,"smk","Learn Azure",
                LocalDate.now().plusYears(1),false));
        toDos.add(new ToDo(2,"sms","Learn AWS",
                LocalDate.now().plusYears(2),false));
        toDos.add(new ToDo(3,"Diddy","Learn SalesForce",
                LocalDate.now().plusYears(3),false));
    }
    public List<ToDo> findByUserName(String username){
        return toDos;
    }
}

package ToDoApp.myFirstWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ToDoService {
    private static List<ToDo> toDos=new ArrayList<>();
    public static int ToDosCount=0 ;
    static{
        toDos.add(new ToDo(++ToDosCount,"smk","Learn Azure",
                LocalDate.now().plusYears(1),false));
        toDos.add(new ToDo(++ToDosCount,"sms","Learn AWS",
                LocalDate.now().plusYears(2),false));
        toDos.add(new ToDo(++ToDosCount,"Diddy","Learn SalesForce",
                LocalDate.now().plusYears(3),false));
    }
    public List<ToDo> findByUserName(String username){
        return toDos;
    }

    public static void addToDo(String username, String descrpition, LocalDate targetDate, boolean done){
        ToDo todo =new ToDo(++ToDosCount,username,descrpition,targetDate,done);
    toDos.add(todo);
    }
    public void deleteById(int id){
        //todo.getId()==id
        //todo->todo.getId()==id this is a lambda function
        Predicate<? super ToDo> predicate
                =todo->todo.getId()==id;
        toDos.removeIf(predicate);
    }
}

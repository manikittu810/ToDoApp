package ToDoApp.myFirstWebApp.todo;

import jakarta.validation.Valid;
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
toDos.add(new ToDo(++ToDosCount,"smk","Learn Azure 1",
        LocalDate.now().plusYears(1),false));
toDos.add(new ToDo(++ToDosCount,"sms","Learn AWS 1",
        LocalDate.now().plusYears(2),false));
toDos.add(new ToDo(++ToDosCount,"Diddy","Learn SalesForce 1",
        LocalDate.now().plusYears(3),false));
}

public static void updateTodo(@Valid ToDo toDo) {
deleteById(toDo.getId());
toDos.add(toDo);
}

public List<ToDo> findByUserName(String username){

Predicate<? super ToDo> predicate
        =toDo -> toDo.getUserName().equalsIgnoreCase(username);
return toDos.stream().filter(predicate).toList();
}

public static void addToDo(String userName, String description, LocalDate targetDate, boolean done){
ToDo todo =new ToDo(++ToDosCount,userName,description,targetDate,done);
toDos.add(todo);
}
public static void deleteById(int id){
//todo.getId()==id
//todo->todo.getId()==id this is a lambda function
Predicate<? super ToDo> predicate
        =toDo->toDo.getId()==id;
toDos.removeIf(predicate);
}

public ToDo findById(int id) {
Predicate<? super ToDo> predicate
        =toDo->toDo.getId()==id;
 ToDo todo=toDos.stream().filter(predicate).findFirst().get();
return todo;
}
}

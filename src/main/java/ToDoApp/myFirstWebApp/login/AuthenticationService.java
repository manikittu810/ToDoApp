package ToDoApp.myFirstWebApp.login;
import org.springframework.stereotype.Service;

@Service
//@Component we can also write component annotation but its a business point of view so we
//specific annotation called service
public class AuthenticationService {
   public boolean authenticate(String username,String password){
       boolean isValidUsername=username.equalsIgnoreCase("Smk123");
       boolean isValidPassword=password.equalsIgnoreCase("smk");
       return isValidUsername && isValidPassword;
   }
}


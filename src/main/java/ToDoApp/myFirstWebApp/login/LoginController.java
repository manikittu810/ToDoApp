package ToDoApp.myFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String loginPage(@RequestParam String name, ModelMap model){
        model.put("name",name);
        System.out.println("Request Param is " + name); //not recommended for production code
        return "login";
    }
}

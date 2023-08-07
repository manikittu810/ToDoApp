package ToDoApp.myFirstWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.slf4j.LoggerFactory.getLogger;

@Controller
public class LoginController {
//    private Logger logger= LoggerFactory.getLogger(getClass());
    @RequestMapping("login")
    public String loginPage(@RequestParam String name, ModelMap model){
        model.put("name",name);
//        logger.debug("I want to print this at debug level {}" ,name);
//        logger.info("I want to print this at info level {}" ,name);
//        logger.warn("I want to print this at warn level {}" ,name);
        System.out.println("Request Param is " + name); //not recommended for production code

        return "login";
    }
}

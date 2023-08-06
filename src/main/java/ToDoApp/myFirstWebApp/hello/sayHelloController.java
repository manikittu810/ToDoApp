package ToDoApp.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {
    @RequestMapping("say-Hello")
    @ResponseBody
    public String sayHello(){
        return "Hello!! This is my first web application with java!! and Spring Boot!!";
    }
    @RequestMapping("say-Hello-HTML")
    @ResponseBody
    public String sayHelloHTML(){
        StringBuffer sb= new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>This is my first web App</title>");
        sb.append("</head>");
        sb.append("<body> This is the Body of HTML</body>");
        sb.append("</html>");
         return sb.toString();
    }
//META-INF/resources/WEB-INF/jsp/sayHello.jsp
//    META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-Hello-jsp")
    public String sayHelloJSP(){
        return "sayHello";
    }
}

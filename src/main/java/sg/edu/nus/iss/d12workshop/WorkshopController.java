package sg.edu.nus.iss.d12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WorkshopController {

    @RequestMapping(path ={"/workshop"})
    public String test() {
        return "workshop";
        //Controller formed 
    }

    
    
}

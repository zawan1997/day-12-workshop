package sg.edu.nus.iss.d12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller class build to direct people to the correct resource
@Controller

// to call the Controller class for this HTML resource, must use this path. The
// resource next to it is the default
@RequestMapping(path = { "/indexresource", "/indexresource.html" })
public class IndexResource {

    @GetMapping(produces = { "text.html" })

    //Without the Model model, the Controller will just be static not dynamic 
    public String index(Model model) {
        return "indexresource";
        //create the html page in the templates folder with the same name
    }

}

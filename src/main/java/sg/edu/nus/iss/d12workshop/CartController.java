package sg.edu.nus.iss.d12workshop;

//#3
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//how are we going to reach this class?
@RequestMapping(path = {"/cart "})
public class CartController {

    //to allow Controller to be dynamic not just static
    @GetMapping(produces = {"text/html"})
    public String displayCart(Model model){

        CartService cs = new CartService();
        List<Item> cartItems = cs.getShoppingItems();
        model.addAttribute("cart", cartItems);
        return "cart";
    }
}

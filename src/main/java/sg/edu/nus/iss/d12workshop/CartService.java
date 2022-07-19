package sg.edu.nus.iss.d12workshop;

import java.util.ArrayList;
import java.util.List;

//Creating the service class
//Servicing the model

public class CartService {

    public List<Item> getShoppingItems(){

        List<Item> lstItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Orange");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Apple");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Egg");
        itm.setQuantity(5);
        lstItems.add(itm);


        return lstItems;
        
    }
    
}

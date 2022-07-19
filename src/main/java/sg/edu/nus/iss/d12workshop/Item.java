package sg.edu.nus.iss.d12workshop;

public class Item {
    // Creating model. Attributes should be private
    //Controller and Service class will interact with Model to produce VIEW
    private String itemName;
    private Integer quantity;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String n) {
        itemName = n;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer i) {
        quantity = i;
    }

}

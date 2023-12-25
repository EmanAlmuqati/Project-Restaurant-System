package resturantsystem;
public class Menuitem {
   //attributes
    private String itemName;
    private double Price; 
    //default constructor
    public Menuitem(){}
    //parameterized constructor 
    public Menuitem(String Name, double Price ){
        itemName= Name;
        this.Price=Price;
    }
    //get method 
    public String getItemName(){
        return itemName; 
    }
   // set methods 
    public void setItemName(String Name){
      itemName= Name;    
    }
    public double getPrice(){
        return this.Price;
    }
    public void setPrice(double Price){
        this.Price = Price;
    }
    // printing
    public String toString(){   
    return("item name: "+itemName+"\n price: "+Price);
    } 
}

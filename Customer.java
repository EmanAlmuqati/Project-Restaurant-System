package resturantsystem;

public class Customer extends User {
    //attributes
    private String Name;
    private double PhoneNumber;
    private String Address;
    private Order order;

//Constructors
    public Customer() {}
    public Customer(String name, double number, String address, Order order,int UserID) {
        super(UserID);
        Name = name;
        PhoneNumber = number;
        Address = address;
        this.order = order;
    }
//Setters
    public void setName(String name) {
        Name = name;
    }
    public void setPhoneNumber(double number) {
        PhoneNumber = number;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setorder(Order order) {
        this.order = order;
    }
//Getters
    public String getName() {
        return Name;
    }
    public double getPhoneNumber() {
        return PhoneNumber;
    }
    public String getAddress() {
        return Address;
    }
    public Order grtOrder() {
        return order;
    }
    //overrided toString method
    public String toString() {
   return ("Name: " + Name + "\nPhone number: " + PhoneNumber + "\nAddress: " + Address + "\nOrder: " + order+"\n"+super.toString());
    }

}

package resturantsystem;

import java.util.*;

public class Order implements PayOrder {

    //Attributes
    private double TotalPrice;
    private String OrderStatus;
    private boolean Delivered;
    private double Discount;
    private ArrayList<Menuitem> OrderItem;

    //Constructors
    public Order() {
    }

    public Order(String order, double total, boolean deliver, double Dis, ArrayList<Menuitem> item) {
        OrderStatus = order;
        TotalPrice = total;
        Delivered = deliver;
        Discount = 0;
        OrderItem = item;
    }

    //setter and getter
    public void setOrderItem(ArrayList<Menuitem> item) {
        OrderItem = item;
    }

    public ArrayList<Menuitem> getOrderItem() {
        return OrderItem;
    }

    public void setTotalPrice(double total) {
        TotalPrice = total;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setOrderStatus(String order) {
        OrderStatus = order;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setDelivered(boolean deliver) {
      Delivered = deliver;
    }

    public boolean getDelivered() {
        return Delivered; }
    public void setDiscount(double Dis) {
        Discount = Dis; }

    public double getDiscount() {
        return Discount;
    }
    // a method for calculating all item prices
    public double CalculateItemTotal() {
        double itemtotal = 0;
        for (int i = 0; i < OrderItem.size(); i++) {
            itemtotal += OrderItem.get(i).getPrice();
        }
        return itemtotal;
    }
    @Override
    public double FindTotal() {
        TotalPrice = 0;
        for (int i = 0; i < OrderItem.size(); i++) {
            TotalPrice += OrderItem.get(i).getPrice();
        }
        //here if The Total price is more than 200 Discount will be applied
        if (TotalPrice > 200) {
            TotalPrice = TotalPrice - Discount;
        }
        return TotalPrice;
    }

    @Override
    public void Print() {
        System.out.println("\tTotal Price" + "\t" + "OrderItem" + "\t" + "Delivered" + "\t" + "Discount"
                + "\n\t" + TotalPrice + "\t" + OrderItem + "\t" + Delivered + "\t" + Discount);

    }
}

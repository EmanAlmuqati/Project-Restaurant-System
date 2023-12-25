package resturantsystem;

public class Watier extends User{
    //Attribute,instance field
 private double tip;
 private String nameWatier;
 public Watier(){}//constructor Without parameter
 public Watier(double t,String NW,int UserID){//constructor Without parameters
 super(UserID);
 tip=t; nameWatier=NW;
 }
 //set and get for each Attribute
 public void setTip(double t){
 tip=t;
 }
 public double getTip(){
 return tip;
 }
 public void setNameWatier(String NW){
 nameWatier=NW;
 }
 public String getNameWatier(){
 return nameWatier;
 }
 public String toString(){//to print the result
 return (" tip of Watier :"+tip+"\n the name of Waiter is: "+nameWatier+"\n"+super.toString());
 }
 
}

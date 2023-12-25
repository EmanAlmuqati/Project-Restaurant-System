package resturantsystem;
public abstract class User {
    //Attribute,instance field
   protected int UserID;
   public User(){}//constructor Without parameter
   public User(int Id){//constructor With parameters
   UserID=Id;
   }//set and get
   public int getUserID(){
   return UserID;
   }
   public void setUserID(int Id){
   UserID=Id;
   }
  public String toString(){//to print result
  return ("user id is:"+UserID+"\n");
  }
  
   
}

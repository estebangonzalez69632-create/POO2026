public class RoomReservation {
   private String guest;
   private int roomNumber;
   private int numberOfNights;
   private double pricePerNight;
   public  String readGuest(){
    return guest;
   } 
   public int readRoomNumber(){
    return roomNumber;
   }
   public int readNumberOfNights(){
    return numberOfNights;
   }
   public double readPricePerNight(){
    return pricePerNight;
   }
   public boolean addGuest(String newGuest){
    if(!newGuest.equals("")){
       guest=newGuest;
       return true;
    }
    return false;
   }
   public void addRoomNumber(int newRoomNumber){
    roomNumber = newRoomNumber;
    
}
   public boolean addNumberOfNights(int newNumberOfNights){
    if(newNumberOfNights>0){
        numberOfNights=newNumberOfNights;
        return true;
    }
    return false;
   }
   public boolean addPricePerNight(int newPricePerNight){
    if(newPricePerNight>0){
        pricePerNight=newPricePerNight;
        return true;
    }
    return false;
   }
   public double TotalCost(){
    double totalCost=pricePerNight*numberOfNights;
    return totalCost;
   }
}

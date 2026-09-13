public class Product{
    private String name;
    private double price;
    private int stock;
    public String readName(){
        return name;
    }
    public double readPrice(){
        return price;
    }
    public int readStock(){
        return stock;
    }
    public boolean changeName(String newName){
        if (!newName.equals("")) {
           name=newName;
            return true;
       }
       return false;
   }
    public boolean changePrice(double newPrice){
        if(newPrice>0){
            price=newPrice;
            return true;
        }
        return false;
    }
    public boolean changeStock(int newStock){
        if(newStock>=0){
            stock=newStock;
            return true;
        }
        return false;
    }
}
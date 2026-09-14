public class ElectronicWallet {
    private String owner;
    private double balance;
   public String readOwner(){
        return owner;
    }
    public double readBalance(){
        return balance;
    }
    public boolean addOwner(String newOwner){
    if(!newOwner.equals("")){
        owner = newOwner;
        return true;
    }
    return false;
    }
    public boolean topUp(double value){
        if(value > 0){
            balance = balance + value;
            return true;
        }
        return false;
    }

    public boolean payment(double value){
        if(value > 0 && value <= balance && value <= 500000){
            balance = balance - value;
            return true;
        }
        return false;
    }
}


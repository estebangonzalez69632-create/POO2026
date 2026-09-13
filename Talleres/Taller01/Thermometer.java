public class Thermometer {
    private double temperature;
    public double readTemperature(){
         return temperature;
    }
    public boolean changeTemperature(double newTemperature){
        if (newTemperature>=-50 && newTemperature<=100){
            temperature=newTemperature;
            return true;
        }
        return false;
    }
    

    
}


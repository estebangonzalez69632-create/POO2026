public class TestThermometer {
    public static void main(String[] args){
        Thermometer temperature1= new Thermometer();
        boolean accepted=temperature1.changeTemperature(45);
        System.out.println(accepted);
        System.out.println(temperature1.readTemperature());
        accepted=temperature1.changeTemperature(200);
        System.out.println(accepted);
        System.out.println(temperature1.readTemperature());
        accepted=temperature1.changeTemperature(-8);
        System.out.println(accepted);
        System.out.println(temperature1.readTemperature());
        accepted=temperature1.changeTemperature(0);
        System.out.println(accepted);
        System.out.println(temperature1.readTemperature());
   }
    
}

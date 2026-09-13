public class TestProduct {
    public static void main(String[] args) {
        Product product1= new Product();
        //PRUEBA 1
        boolean accepted1=product1.changeName("ARROZ");
        System.out.println(product1.readName());
        System.out.println(accepted1);
        boolean accepted2=product1.changePrice(3000);
        System.out.println(product1.readPrice());
        System.out.println(accepted2);
        boolean accepted3=product1.changeStock(50);
        System.out.println(product1.readStock());
        System.out.println(accepted3);
        //Prueba#2
        accepted1=product1.changeName("");
        System.out.println(product1.readName());
        System.out.println(accepted1);
        accepted2=product1.changePrice(3000);
        System.out.println(product1.readPrice());
        System.out.println(accepted2);
        accepted3=product1.changeStock(6);
        System.out.println(product1.readStock());
        System.out.println(accepted3);
       // PRUEBA 3
        accepted1=product1.changeName("ARROZ");
        System.out.println(product1.readName());
        System.out.println(accepted1);
        accepted2=product1.changePrice(-8796);
        System.out.println(product1.readPrice());
        System.out.println(accepted2);
        accepted3=product1.changeStock(7);
        System.out.println(product1.readStock());
        System.out.println(accepted3);
        //PRUEBA 4
         accepted1=product1.changeName("ARROZ");
        System.out.println(product1.readName());
        System.out.println(accepted1);
        accepted2=product1.changePrice(5400);
        System.out.println(product1.readPrice());
        System.out.println(accepted2);
        accepted3=product1.changeStock(-78);
        System.out.println(product1.readStock());
        System.out.println(accepted3);
        // PRUEBA 5
        accepted1=product1.changeName("ARROZ");
        System.out.println(product1.readName());
        System.out.println(accepted1);
        accepted2=product1.changePrice(0);
        System.out.println(product1.readPrice());
        System.out.println(accepted2);
        accepted3=product1.changeStock(-8);
        System.out.println(product1.readStock());
        System.out.println(accepted3);
        //PRUEBA 6
        accepted1=product1.changeName("");
        System.out.println(product1.readName());
        System.out.println(accepted1);
        accepted2=product1.changePrice(0);
        System.out.println(product1.readPrice());
        System.out.println(accepted2);
        accepted3=product1.changeStock(-8);
        System.out.println(product1.readStock());
        System.out.println(accepted3);
    }
    
}

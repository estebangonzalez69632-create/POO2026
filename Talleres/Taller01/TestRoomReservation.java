public class TestRoomReservation {
    public static void main(String[] args) {
     RoomReservation reservation1= new RoomReservation();
     //PROOF 1
     boolean accepted_guest=reservation1.addGuest("ESTEBAN");
     System.out.println(accepted_guest);
     System.out.println(reservation1.readGuest());
     reservation1.addRoomNumber(34);
     System.out.println(reservation1.readRoomNumber());
     boolean accepted_NumberOfNights=reservation1.addNumberOfNights(8);
     System.out.println(accepted_NumberOfNights);
     System.out.println(reservation1.readNumberOfNights());
     boolean accepted_pricePerNight=reservation1.addPricePerNight(50000);
     System.out.println((accepted_pricePerNight));
     System.out.println(reservation1.readPricePerNight());
     System.out.println("EL COSTO TOTAL = "+reservation1.TotalCost());
     //PROOF 2
     accepted_guest=reservation1.addGuest("");
     System.out.println(accepted_guest);
     System.out.println(reservation1.readGuest());
     reservation1.addRoomNumber(34);
     System.out.println(reservation1.readRoomNumber());
     accepted_NumberOfNights=reservation1.addNumberOfNights(8);
     System.out.println(accepted_NumberOfNights);
     System.out.println(reservation1.readNumberOfNights());
     accepted_pricePerNight=reservation1.addPricePerNight(50000);
     System.out.println((accepted_pricePerNight));
     System.out.println(reservation1.readPricePerNight());
     System.out.println("EL COSTO TOTAL = "+reservation1.TotalCost());
     //PROOF 3
     accepted_guest=reservation1.addGuest("ESTEBAN");
     System.out.println(accepted_guest);
     System.out.println(reservation1.readGuest());
     reservation1.addRoomNumber(34);
     System.out.println(reservation1.readRoomNumber());
     accepted_NumberOfNights=reservation1.addNumberOfNights(-7);
     System.out.println(accepted_NumberOfNights);
     System.out.println(reservation1.readNumberOfNights());
     accepted_pricePerNight=reservation1.addPricePerNight(50000);
     System.out.println((accepted_pricePerNight));
     System.out.println(reservation1.readPricePerNight());
     System.out.println("EL COSTO TOTAL = "+reservation1.TotalCost());
     //PROOF 4
     accepted_guest=reservation1.addGuest("ESTEBAN");
     System.out.println(accepted_guest);
     System.out.println(reservation1.readGuest());
     reservation1.addRoomNumber(34);
     System.out.println(reservation1.readRoomNumber());
     accepted_NumberOfNights=reservation1.addNumberOfNights(8);
     System.out.println(accepted_NumberOfNights);
     System.out.println(reservation1.readNumberOfNights());
     accepted_pricePerNight=reservation1.addPricePerNight(-45000);
     System.out.println((accepted_pricePerNight));
     System.out.println(reservation1.readPricePerNight());
     System.out.println("EL COSTO TOTAL = "+reservation1.TotalCost());
     //PROOF 5
     accepted_guest=reservation1.addGuest("");
     System.out.println(accepted_guest);
     System.out.println(reservation1.readGuest());
     reservation1.addRoomNumber(34);
     System.out.println(reservation1.readRoomNumber());
     accepted_NumberOfNights=reservation1.addNumberOfNights(-9);
     System.out.println(accepted_NumberOfNights);
     System.out.println(reservation1.readNumberOfNights());
     accepted_pricePerNight=reservation1.addPricePerNight(-100000);
     System.out.println((accepted_pricePerNight));
     System.out.println(reservation1.readPricePerNight());
     System.out.println("EL COSTO TOTAL = "+reservation1.TotalCost());
    }
}

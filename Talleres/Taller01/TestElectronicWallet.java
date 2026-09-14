public class TestElectronicWallet {
    public static void main(String[] args) {
        ElectronicWallet wallet1 = new ElectronicWallet();
        //PROOF 1  RECARGA VÁLIDA
        boolean accepted_owner = wallet1.addOwner("ANDREA");
        System.out.println(accepted_owner);
        System.out.println(wallet1.readOwner());
        boolean accepted_topUp = wallet1.topUp(300000);
        System.out.println(accepted_topUp);
        System.out.println("BALANCE = " + wallet1.readBalance());
        //PROOF 2 RECARGA NO PERMITIDA
        accepted_topUp = wallet1.topUp(-50000);
        System.out.println(accepted_topUp);
        System.out.println("BALANCE = " + wallet1.readBalance());
        //PROOF 3 PAGO VÁLIDO
        boolean accepted_payment = wallet1.payment(100000);
        System.out.println(accepted_payment);
        System.out.println("BALANCE = " + wallet1.readBalance());
        //PROOF 4 PAGO SUPERIOR AL SALDO
        accepted_payment = wallet1.payment(300000);
        System.out.println(accepted_payment);
        System.out.println("BALANCE = " + wallet1.readBalance());
        //PROOF 5 - PAGO SUPERIOR A $500.000
        accepted_payment = wallet1.payment(600000);
        System.out.println(accepted_payment);
        System.out.println("BALANCE = " + wallet1.readBalance());
        //PROOF 6 PAGO NO PERMITIDO
        accepted_payment = wallet1.payment(-50000);
        System.out.println(accepted_payment);
        System.out.println("BALANCE = " + wallet1.readBalance());
    }
}


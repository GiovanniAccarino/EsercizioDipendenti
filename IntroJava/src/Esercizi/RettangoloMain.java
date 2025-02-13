package Esercizi;

public class RettangoloMain {

    public static void main(String[] args) {

        Rettangolo r1 = new Rettangolo();

        r1.setAltezza(10);
        r1.setBase(5);

        r1.stampa();

        System.out.println("*************");

        Rettangolo r2 = new Rettangolo();

        r2.setAltezza(30);
        r2.setBase(5);

        r2.stampa();
    }
}

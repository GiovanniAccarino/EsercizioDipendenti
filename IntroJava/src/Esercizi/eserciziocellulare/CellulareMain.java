package Esercizi.eserciziocellulare;

public class CellulareMain {

    public static void main(String[] args) {

        Sim s1 = new Sim("32036909090");

        s1.stampaInfo();

        s1.chiama("3506060102", 0.50);

        s1.ricaricaCredito(100);

        s1.stampaInfo();

        s1.chiama("1", 4.00);
        s1.chiama("2", 5.00);
        s1.chiama("3", 10.00);
        s1.chiama("4", 20.00);
        s1.chiama("5", 3.00);
        s1.chiama("6", 5.00);

        s1.stampaInfo();
    }
}

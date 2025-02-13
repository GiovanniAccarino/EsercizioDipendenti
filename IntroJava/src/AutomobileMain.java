public class AutomobileMain {

    public static void main(String[] args) {

        Automobile panda = new Automobile();

        panda.marca="fiat";
        panda.modello="panda";
        panda.cilindrata=1000;
        panda.colore="bianco";

        System.out.println(panda); //indirizzo di memoria

        Automobile panda2 = new Automobile();

        panda2.marca="fiat";
        panda2.modello="panda";
        panda2.cilindrata=1000;
        panda2.colore="bianco";

        System.out.println(panda2); //indirizzo di memoria differente
    }
}

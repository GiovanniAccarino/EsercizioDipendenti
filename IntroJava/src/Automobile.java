public class Automobile {

    public String marca;
    public String modello;
    public int cilindrata;
    public String colore;
    public boolean motoreAcceso = false;

    public void start() {
        System.out.println("Start auto");
        motoreAcceso=true;
    }

    public void stop() {
        System.out.println("Stop auto");
        motoreAcceso=false;
    }

}

package Esercizi.eserciziocellulare;

public class Chiamata {

    private String numeroChiamato;
    private double durata;

    public Chiamata (String numeroChiamato, double durata){
        this.numeroChiamato=numeroChiamato;
        this.durata=durata;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    public void stampaChiamata() {
        System.out.println("Destinatario " + this.numeroChiamato);
        System.out.println("Durata " + this.durata);
    }

}

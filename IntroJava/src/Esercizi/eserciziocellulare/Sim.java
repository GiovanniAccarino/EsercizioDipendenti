package Esercizi.eserciziocellulare;

import java.util.ArrayList;
import java.util.List;

public class Sim {

    static final double costoChiamate = 0.20;

    private String numeroCellulare;
    private double creditoDisponibile;
    private Chiamata[] chiamateEffettuate;

    public Sim (String numeroCellulare) {
        this.numeroCellulare=numeroCellulare;
        this.creditoDisponibile=0;
        this.chiamateEffettuate= new Chiamata[5];

    }

    public void stampaInfo() {
        System.out.println("Numero cellulare: " + this.numeroCellulare);
        System.out.println("Credito disponibile: " + this.creditoDisponibile);
        System.out.println("Chiamate effettuate: ");
        for (int i = 0; i < chiamateEffettuate.length; i++) {
            if (chiamateEffettuate[i] != null) {
                chiamateEffettuate[i].stampaChiamata();
            }
        }
    }

    public void chiama(String numeroChiamato, double durata) {
        if(this.creditoDisponibile>=0.20){
            System.out.println("Chiamata effettuata");
            Chiamata c1 = new Chiamata(numeroChiamato, durata);

            this.creditoDisponibile-= durata*costoChiamate;
                if (creditoDisponibile<=0) {
                    System.out.println("Credito terminato, effettuare ricarica");
                }

            // Spostamento delle chiamate esistenti per fare spazio alla nuova chiamata
            for (int i = 0; i < chiamateEffettuate.length - 1; i++) {
                chiamateEffettuate[i] = chiamateEffettuate[i + 1];
            }

            // Aggiunta della nuova chiamata alla fine dell'array
            chiamateEffettuate[chiamateEffettuate.length - 1] = c1;

            System.out.println("Costo chiamata: " + durata*costoChiamate + " euro.");
        } else {
            System.out.println("Credito terminato, effettuare ricarica");
        }
    }

    public void ricaricaCredito (double carica) {
        this.creditoDisponibile+=carica;
        System.out.println("Il credito disponibile è ora " + creditoDisponibile + " euro.");
    }




}

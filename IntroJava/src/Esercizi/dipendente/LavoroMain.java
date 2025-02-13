package Esercizi.dipendente;

public class LavoroMain {

    public static void main(String[] args) {

        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = new Dipendente("001", "M. Rossi", Dipartimento.AMMINISTRAZIONE);
        dipendenti[1] = new DipendenteFullTime("002", "Luca Bianchi", Dipartimento.AMMINISTRAZIONE);
        dipendenti[2] = new DipendentePartTime("003", "Anna Verdi", Dipartimento.VENDITE, 5);
        dipendenti[3] = new Dirigente("004", "Giulia Neri", Dipartimento.AMMINISTRAZIONE);

        for (int i = 0; i < dipendenti.length; i++) {

            if (dipendenti[i] instanceof DipendenteFullTime) {
            System.out.println("Dipendente " + (i + 1) + ":");
            DipendenteFullTime d = (DipendenteFullTime) dipendenti[i];
            d.stampaDipendente();
            System.out.println("-------------------------");
            } else if (dipendenti[i] instanceof DipendentePartTime) {
                System.out.println("Dipendente " + (i + 1) + ":");
                DipendentePartTime d = (DipendentePartTime) dipendenti[i];
                d.stampaDipendente();
                System.out.println("-------------------------");
            } else if (dipendenti[i] instanceof Dirigente){
                System.out.println("Dipendente " + (i + 1) + ":");
                Dirigente d = (Dirigente) dipendenti[i];
                d.stampaDipendente();
                System.out.println("-------------------------");
            } else {
                System.out.println("Dipendente " + (i + 1) + ":");
                Dipendente d = dipendenti[i];
                System.out.println("Nome: " + d.getNome());
                System.out.println("Matricola: " + d.getMatricola());
                System.out.println("Stipendio: " + d.getStipendio());
                System.out.println("Dept.: " + d.getDipartimento());
                System.out.println("-------------------------");
            }
        }

    }
}

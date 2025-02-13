package Esercizi.dipendente;

public class Dirigente extends Dipendente{



    public Dirigente(String matricola, String nome, Dipartimento dipartimento) {
        super(matricola, nome, dipartimento);
    }

    public double calculateSalary(){
        double stipendioCalcolato;
        switch (this.getDipartimento()) {
            case AMMINISTRAZIONE :
                stipendioCalcolato= this.getStipendio()*2;
                break;
            case PRODUZIONE :
                stipendioCalcolato= this.getStipendio()*2;
                break;
            case VENDITE :
                stipendioCalcolato= this.getStipendio()*2;
                break;
            default:
                stipendioCalcolato= this.getStipendio();

        }

        return stipendioCalcolato;
    }

    public void stampaDipendente() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricola: " + this.getMatricola());
        System.out.println("Stipendio: " + calculateSalary());
        System.out.println("Dept.: " + this.getDipartimento());
    }
}

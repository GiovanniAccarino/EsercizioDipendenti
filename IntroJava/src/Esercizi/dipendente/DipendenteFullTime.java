package Esercizi.dipendente;

public class DipendenteFullTime extends Dipendente{

    private double stipendio;

    public DipendenteFullTime(String matricola, String nome, Dipartimento dipartimento) {
        super(matricola, nome, dipartimento);
    }

    public double calculateSalary(){
        return this.getStipendio();
    }

    public void stampaDipendente() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricola: " + this.getMatricola());
        System.out.println("Dept.: " + this.getDipartimento());
        System.out.println("Stipendio: " + calculateSalary());
    }

}

package Esercizi.dipendente;

public class DipendentePartTime extends Dipendente{

    private static final double stipendioAOre = 25;
    private int oreAContratto;



    public DipendentePartTime(String matricola, String nome, Dipartimento dipartimento, int ore) {
        super(matricola, nome, dipartimento);
        this.oreAContratto=ore;
    }

    public double calculateSalary(){
        return this.oreAContratto*stipendioAOre;
    }


    public void stampaDipendente() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricola: " + this.getMatricola());
        System.out.println("Stipendio: " + calculateSalary());
        System.out.println("Dept.: " + this.getDipartimento());
    }
}

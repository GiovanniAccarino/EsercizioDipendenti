package Esercizi.dipendente;

public class Dipendente {

    private String matricola;
    private String nome;
    private double stipendioBase;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola,String nome, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.nome=nome;
        this.stipendioBase = 1500;
        this.dipartimento = dipartimento;
        this.stipendio = calculateSalary();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double calculateSalary() {
        double stipendioCalcolato;
        switch (this.dipartimento) {
            case AMMINISTRAZIONE:
                stipendioCalcolato = this.stipendioBase + 200;
                break;
            case PRODUZIONE:
                stipendioCalcolato = this.stipendioBase;
                break;
            case VENDITE:
                stipendioCalcolato = this.stipendioBase + 100;
                break;
            default:
                stipendioCalcolato = this.stipendioBase;
        }
        return stipendioCalcolato;
    }


}

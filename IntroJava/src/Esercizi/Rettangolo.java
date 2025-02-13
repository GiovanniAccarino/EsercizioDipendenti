package Esercizi;

public class Rettangolo {

    private double base;
    private double altezza;

    public double getAltezza() {
        return altezza;
    }

    public double getBase() {
        return base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area() {
        double area = base*altezza;

        return area;
    }

    public double perimetro() {
        double perimetro = (base+altezza)*2;
        return perimetro;
    }

    public void stampa() {
        double perimetro = perimetro();
        double area = area();

        System.out.println("Il rettangolo ha base " + base + " altezza: " + altezza
        + "\n. La loro area è " + area + " il loro perimetro è " + perimetro);


    }
}




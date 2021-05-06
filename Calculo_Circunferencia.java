import java.lang.Math;
public class Calculo_Circunferencia {
    private double raio, area, perimetro;
    final double PI = 3.14;
    public Calculo_Circunferencia(){
        this.setRaio(raio);
    }

    // Funções para área e perimetro:

    public double calculaArea(double raio){
        return PI*(Math.pow(getRaio(),2));
    }

    public double calculaPerimetro(double raio){
        return 2*PI*getRaio();
    }

    // Métodos Get e Set:

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
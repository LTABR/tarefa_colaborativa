import java.lang.Math;
public class Calculo_Circunferencia {
    double raio, area, perimetro;
    final double PI = 3.14;
    public Calculo_Circunferencia(){
        this.raio = raio;
        this.perimetro = perimetro;
        this.area = area;
    }

    // Funções para área e perimetro

    public double calculaArea(double raio){
        return PI*(Math.pow(raio, 2));
    }

    public double calculaPerimetro(double raio){
        return 2*PI*raio;
    }
}
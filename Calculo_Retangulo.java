public class Calculo_Retangulo {
    private double altura, base, area, perimetro;
    public Calculo_Retangulo(){
        this.setAltura(altura);
        this.setBase(base);
    }

    // Funções para área e perimetro

    public double calculaArea(double altura, double base){
        return base*altura;
    }

    public double calculaPerimetro(double altura, double base){
        return (base+altura)*2;
    }

    // Métodos Get e Set

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

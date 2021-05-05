public class main{    
    public static void main(String[] args) {     
        // Objeto da classe retangulo   
        Calculo_Retangulo forma1 = new Calculo_Retangulo();
        forma1.base = 2;
        forma1.altura = 3;
        forma1.area = forma1.calculaArea(forma1.altura, forma1.base);
        forma1.perimetro = forma1.calculaPerimetro(forma1.base,forma1.altura);
        System.out.println(forma1.area+" "+forma1.perimetro);

        // Objeto da classe Circunferência 

        Calculo_Circunferencia forma2 = new Calculo_Circunferencia();
        forma2.raio = 5;
        forma2.area = forma2.calculaArea(forma2.raio);
        forma2.perimetro = forma2.calculaPerimetro(forma2.raio);
        System.out.println(forma2.area+" "+forma2.perimetro);
    } 
}

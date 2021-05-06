import javax.swing.JOptionPane;
public class main extends Calculo_Circunferencia{
    public static void main(String[] args) { 
        boolean aux1 = true;
        int aux2;  
        do {
            aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n1 - Retangulo\n2 - Circulo\n0 - Sair"));
            switch (aux2) {
                case 1:
                    Calculo_Retangulo retangulo = new Calculo_Retangulo();
                    retangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da base")));
                    retangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da altura")));
                    retangulo.setArea(retangulo.calculaArea(retangulo.getAltura(), retangulo.getBase()));
                    retangulo.setPerimetro(retangulo.calculaPerimetro(retangulo.getAltura(), retangulo.getBase()));
                    JOptionPane.showMessageDialog(null, "Valor da área do retangulo: " + retangulo.getArea() + "\nValor do perimetro do retangulo: " + retangulo.getPerimetro());
                    break;
                case 2:
                    Calculo_Circunferencia circulo = new Calculo_Circunferencia();
                    circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do raio")));
                    circulo.setArea(circulo.calculaArea(circulo.getRaio()));
                    circulo.setPerimetro(circulo.calculaPerimetro(circulo.getRaio()));
                    JOptionPane.showMessageDialog(null, "Valor da área do circulo: " + circulo.getArea() + "\nValor do perimetro do circulo: " + circulo.getPerimetro());
                    break;
                case 0:
                    aux1 = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
            }
        
        } while(aux1 == true);
    } 
}

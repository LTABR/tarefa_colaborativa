import javax.swing.JOptionPane;
public class main extends Calculo_Circunferencia{
    public static void main(String[] args) {
        int aux;  
        do {
            aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n1 - Retângulo\n2 - Circunferência\nOutro - Sair"));
            switch (aux) {
                case 1:
                    Calculo_Retangulo retangulo = new Calculo_Retangulo();
                    retangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da base")));
                    retangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da altura")));
                    retangulo.setArea(retangulo.calculaArea(retangulo.getAltura(), retangulo.getBase()));
                    retangulo.setPerimetro(retangulo.calculaPerimetro(retangulo.getAltura(), retangulo.getBase()));
                    JOptionPane.showMessageDialog(null, "Valor da área do retângulo: " + retangulo.getArea() + "\nValor do perímetro do retângulo: " + retangulo.getPerimetro());
                    break;
                case 2:
                    Calculo_Circunferencia circulo = new Calculo_Circunferencia();
                    circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do raio")));
                    circulo.setArea(circulo.calculaArea(circulo.getRaio()));
                    circulo.setPerimetro(circulo.calculaPerimetro(circulo.getRaio()));
                    JOptionPane.showMessageDialog(null, "Valor da área da circunferência: " + circulo.getArea() + "\nValor do perímetro da circunferência: " + circulo.getPerimetro());
                    break;
            }        
        } while(aux > 0 && aux <= 2);
    } 
}

import javax.swing.JOptionPane;
class piramide{
public static void main(String args[]){
double altura, lado, v;

altura= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da altura da pirâmide em cm","ALTURA",3));

lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor dos lados da pirâmide em cm","LADOS",3));

lado2 = Math.pow(r,2);

v = (altura*lado2)/3

JOptionPane.showMessageDialog(null,"O volume da pirâmmide em cm é de:"+v+"  ","VOLUME",1);

}
}
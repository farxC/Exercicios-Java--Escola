import javax.swing.JOptionPane;
class e{
public static void main(String args[]){
double v,l,a;
String valor;
l= Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o lado da piramide em cm","LADO",3));
a= Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite a altura da piramide em cm","ALTURA",3));
l= Math.pow(l,2);
v= ((a*l)/3);
JOptionPane.showMessageDialog(null,"O Volume da piramide em cm é de:"+v+"  ","VOLUME",1);


}
}


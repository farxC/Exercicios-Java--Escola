import javax.swing.JOptionPane;
class h{
public static void main(String args[]){
double v,r,altura;
r=Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o valor do raio do cone em cm","RAIO",3));
altura= Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o valor da altura do cone em cm","ALTURA",3));
r2= Math.pow(r,2);
v=((3.14*r2*altura)/3);
JOptionPane.showMessageDialog(null,"O volume do cone em cm é de:"+v+"  ","VOLUME",1);
}
}

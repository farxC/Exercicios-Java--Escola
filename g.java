import javax.swing.JOptionPane;
class g{
public static void main(String args[]){
double v,raio;
raio= Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o valor do raio da esfera em cm","RAIO",3));
raio= Math.pow(raio,2);
v= ((4*3.14*raio)/3);
JOptionPane.showMessageDialog(null,"O valor do volume da esfera em cm é de:"+v+"  ","VOLUME",1);
}
}


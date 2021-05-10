import javax.swing.JOptionPane;
class f{
public static void main(String args[]){
double v,aresta;
aresta= Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o valor da aresta do cubo em cm","ARESTA",3));
aresta= Math.pow(aresta,3);
v= aresta;
JOptionPane.showMessageDialog(null,"O valor do volume do cubo em cm é de:"+v+"  ","VOLUME",1);
}
}

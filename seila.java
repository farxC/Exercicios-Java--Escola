import javax.swing.JOptionPane;
class seila{
public static void main(String args[]){
int a,b,c,d,e,f,x,y;
a= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor insira o valor do coeficiente A","COEFICIENTE",3));
b= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor insira o valor do coeficiente B","COEFICIENTE",3));
c= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor insira o valor do coeficiente C","COEFICIENTE",3));
d= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor insira o valor do coeficiente D","COEFICIENTE",3));
e= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor insira o valor do coeficiente E","COEFICIENTE",3));
f= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor insira o valor do coeficiente F","COEFICIENTE",3));
x= ((c*e)-(b*f))/((a*b)-(b*d));
y=((a*f)-(c*d))/((a*e)-(b*d));
JOptionPane.showMessageDialog(null,"O Valor de X é de:"+x+" ","VALOR",1);
JOptionPane.showMessageDialog(null,"O Valor de Y é de:"+y+" ","VALOR",1);


}
}
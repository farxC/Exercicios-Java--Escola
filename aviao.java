import javax.swing.JOptionPane;
class aviao{
//o nome é aviao pq isso é mt grande
public static void main(String args[]){
int ano1,ano2,a,d,m,s;
ano1= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digite seu ano atual","ATUAL",3));
ano2= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digite o ano de seu nascimento","NASCIMENTO",3));
a=(ano1-ano2);
m=(a*12);
d=(m*30);
s=(d/7);
JOptionPane.showMessageDialog(null,"Você tem "+a+" anos, "+m+" meses, "+d+" dias, "+s+" semanas de vida","TEMPO VIDA",1);
}
}





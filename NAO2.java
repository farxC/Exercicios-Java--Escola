import javax.swing.JOptionPane;
class NAO2{
public static void main(String args[]){
int idade;
double altura;
int mi=0;
double ma=0;


for(int i=0; i<4; i++){
altura= Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor estudante digite sua altura","ALTURA",3));
idade= Integer.parseInt(JOptionPane.showInputDialog(null,"por favor estudante digite sua idade","ALTURA",3));
mi= mi+idade;
ma=ma+altura;
}
ma= ma/4;
mi= mi/4;
JOptionPane.showMessageDialog(null,"A Média de idade é de "+mi+" anos","IDADE",1);
JOptionPane.showMessageDialog(null,"A Média de altura é de "+ma+" metros","ALTURA",1);
	}
		}

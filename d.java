import javax.swing.JOptionPane;
class d{
public static void main(String args[]){
	double d,p,e,dd,cv;
	int escolha;
	d= 4.81;
	p=0.25;
	e=5.45;
	escolha=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digite a moeda que quer converter- 1 para dolar, 2 para euro e 3 para peso","CONVERSÃO",3));
	dd= Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite a quantidade","CONVERSÃO",3));
	if(escolha==1){
cv=(dd*d);
	JOptionPane.showMessageDialog(null,"Você tem "+cv+" -dolares para reais-","CONVERSÃO",1);
}else{
	if(escolha==2){
cv=(dd*e);
	JOptionPane.showMessageDialog(null,"Você tem "+cv+" -euros para reais-","CONVERSÃO",1);
}else{
	if(escolha==3){
cv=(dd*p);
	JOptionPane.showMessageDialog(null,"Você tem "+cv+" -pesos para reais-","CONVERSÃO",1);

	}	
	}
	}
		}
			}	
import javax.swing.JOptionPane;
class c{
public static void main(String args[]){

	String nome;
	float peso,altura,IMC;
	
	nome= JOptionPane.showInputDialog(null,"Por favor digite seu nome","NOME",3);
	altura= Float.parseFloat(JOptionPane.showInputDialog(null,"Por favor "+nome+" informe sua altura","ALTURA",3));
	peso= Float.parseFloat(JOptionPane.showInputDialog(null,"Por favor "+nome+" informe seu peso","PESO",3));
	IMC=(peso/(altura*altura));
if (IMC<17){
	JOptionPane.showMessageDialog(null,"Você está muito abaixo do peso","IMC",1);
	System.out.print(+IMC);

}else{
if ((IMC>=17)&&(IMC<18.49)){
	JOptionPane.showMessageDialog(null,"Você está abaixo do peso","IMC",1);
}else{
if ((IMC>=18.5)&&(IMC<24.99)){
	JOptionPane.showMessageDialog(null,"Você está com o peso normal","IMC",1);
}else{
if((IMC>25)&&(IMC<29.99)){
	JOptionPane.showMessageDialog(null,"Você está acima do peso","IMC",1);
}else{
if((IMC>30)&&(IMC<34.99)){
	JOptionPane.showMessageDialog(null,"Você está com obesidade I","IMC",1);
}else{
if((IMC>35)&&(IMC<39.99)){
	JOptionPane.showMessageDialog(null,"Você está com obesidade II","IMC",1);
}else{
if(IMC>40){
	JOptionPane.showMessageDialog(null,"Você está com obesidade severa","IMC",1);

}
}



}
}

	}
	}
		}
	


		}
			}
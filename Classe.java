import javax.swing.JOptionPane;
class Classe{

	public static void main (String args[]){
	int idade =18;
System.out.print("Utilizei o print");
System.out.println("E agora com println");
System.out.println("Idade:"+idade);
JOptionPane.showMessageDialog(null,"A idade é "+idade,"Janela idade",
JOptionPane.INFORMATION_MESSAGE);

	}

}
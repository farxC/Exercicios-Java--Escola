import javax.swing.JOptionPane;
	class b{
	public static void main(String args[]){
	String nome;
	int idade;
	int dias;
		nome= JOptionPane.showInputDialog(null,"Por favor digite seu nome","NOME",3);
		idade= Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digite sua idade","IDADE",JOptionPane.QUESTION_MESSAGE));
	dias= (idade*365);
JOptionPane.showMessageDialog(null,"Olá "+nome+" você já viveu "+dias+" dias","JANELA",1);


				}
					}
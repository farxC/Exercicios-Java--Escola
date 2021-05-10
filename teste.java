import javax.swing.JOptionPane;
class teste{
	public static void main (String args[]){
	String nome;
nome = JOptionPane.showInputDialog(null,"Insira seu nome","Quem faz isso é doente", JOptionPane.QUESTION_MESSAGE);
	JOptionPane.showMessageDialog(null," Seu nome é: "+nome,"Quem faz isso é doente",JOptionPane.INFORMATION_MESSAGE);}}
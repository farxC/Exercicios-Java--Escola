import javax.swing.JOptionPane;

class quemano{

public static void main(String args[]){

int opcao;

opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção: 1| Para cancelamento do cartão| 2|Para consultar seu saldo| 3| Para habilitar cartão para compras no exterior| 4| Para falar com um atendente|","OPCOES",3));

switch(opcao){

case 1: {
String numero;
numero = JOptionPane.showInputDialog(null,"Digite o número do cartão para cancelar","CANCELAMENTO",3);
if (numero.length() == 16){
JOptionPane.showMessageDialog(null,"Seu cartão foi cancelado","CANCELAMENTO",1);
} else {
JOptionPane.showMessageDialog(null,"O número do cartão inserido não é correspondente ou não existe","CANCELAMENTO",1);
}

break;
}
case 2:{
String numero;

numero= JOptionPane.showInputDialog(null,"Por favor digite o número do cartão","CARTAO",3);
if(numero.length() ==16){
JOptionPane.showMessageDialog(null,"Seu cartão tem um saldo de X R$","CARTAO",1);
} else {
JOptionPane.showMessageDialog(null,"O Número do cartão inserido não é correspondente ou não existe","CARTAO",1);
}
break;
}
case 3: {
String numero;
numero = JOptionPane.showInputDialog(null,"Digite o número do cartão para habilitar","EXTERIOR",3);
if (numero.length() == 16){
JOptionPane.showMessageDialog(null,"Seu cartão fora habilitado as compras no exterior","EXTERIOR",1);
} else {
JOptionPane.showMessageDialog(null,"O número do cartão inserido não é correspondente ou não existe","EXTERIOR",1);
}

break;
}
case 4: {
JOptionPane.showMessageDialog(null,"Estamos encaminhando você a um atendente","ATENDENTE",1);
}

break;

default: {

JOptionPane.showMessageDialog(null,"Opção não encontrada, tente novamente","OPCOES",1);

}






}
}
}
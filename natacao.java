
import javax.swing.JOptionPane;

class natacao{
public static void main(String args[]) {
int idade;
float tempo;
int quantim;
idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do nadador","Janela Idade",1));

tempo = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o tempo do nadador","Janela Tempo",1));
quantim= Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a quantidade em metros para a prova de Estilos","PROVA",1));
JOptionPane.showMessageDialog(null, "A categoria e: "+categoria(idade)+"<>"+record50(tempo),"Resultado",3);



}


public static String record50(float tempo){
String record = "";
if (tempo < 20.91){
record = "Novo recorde mundial";
}
return record;
}




public static String categoria(int idade){
String cat = "Não encontrado";

if ((idade >= 5 ) && (idade <=7)){
cat = "Infantil A";
}
if ((idade >= 8 ) && (idade <=10)){
cat = "Infantil B";
}
if ((idade >= 11 ) && (idade <=13)){
cat = "Juvenil A";
}
if ((idade >= 14 ) && (idade <=17)){
cat = "Juvenil B";
}
if (idade >= 18){
cat = "Adulto";
}
return cat;
}
}
}
}
}


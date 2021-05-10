import javax.swing.JOptionPane;


 class a1 {
public static void main(String[] args) {
int idade;
float tempo;
int quantim;
int p;
idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do nadador",
"Janela Idade",1));

tempo = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o tempo do nadador",
"Janela Tempo",1));
quantim= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os metros da prova de Estilo","PROVA",1));
p= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe se a prova será internacional ou nacional 1-Nacional 2-Internacional","PROVA",1));
JOptionPane.showMessageDialog(null, "A categoria e: "+categoria(idade)+"<>"+record50(tempo),"Resultado",1);
JOptionPane.showMessageDialog(null, "O nadador vai competir na prova de "+provaEstilo(quantim),"PROVA",1);
JOptionPane.showMessageDialog(null, "O nadador vai comeptir em uma "+ni(p),"PROVA",1);


}


public static String record50(float tempo){
String record = "";
if (tempo < 20.91){
record = "Novo recorde mundial";
}
return record;
}




public static String categoria(int idade){
String cat = "Não encotrado";

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
public static String provaEstilo(int quantim){ 
String metros= "Não encontrado"; 
if(quantim==200){ 
metros= "Prova de 200 metros";
} 
if(quantim==400){ 
metros= "Prova de 400 metros"; 
}
return metros;
}
public static String ni(int p){
String in= "Não encontrado";
if(p== 1){
in= "Prova Nacional";
}
if(p== 2){
in="Prova Internacional";
}
return in;
}

}


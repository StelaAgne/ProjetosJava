import java.util.Scanner;

public class Media2 {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
Double nota1, nota2, media;
System.out.println("Digite a primeira nota:");
nota1 = teclado.nextDouble();
System.out.println("Digite a segunda nota:");
nota2= teclado.nextDouble();
media = (nota1+nota2)/2;
System.out.println("A sua m�dia e:" + media);

if (media >= 6 && media <= 10) {
System.out.println("voc�foi aprovado!");
}else if (media >= 5 && media <= 6) {
System.out.println("voc� ficou em recupera��o.");
}else {
System.out.println("Voc� foi reprovado.");
}








}

}

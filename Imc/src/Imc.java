import java.util.Scanner;

public class Imc {

public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
Double peso, altura, imc;
System.out.println("Vamos calcular sua massa corporal!");
System.out.println("Digite seu peso:");
	peso = teclado.nextDouble();
	System.out.println("Digite sua altura:");
	altura = teclado.nextDouble();
imc = peso / (altura * altura);
System.out.println("Sua massa corporal ?: " +imc);
}
}

import java.util.Scanner;

public class AreaTriangulo {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
Double base, altura, area;

System.out.println("Qual a medida da base:");
base = teclado.nextDouble();
System.out.println("Qual a medida da altura:");
altura = teclado.nextDouble();
area = base*altura;
System.out.println("A área do triângulo é:" + area);
}
}

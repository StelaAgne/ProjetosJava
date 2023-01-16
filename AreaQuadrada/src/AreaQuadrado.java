import java.util.Scanner;

public class AreaQuadrado {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
Double lado, area;
System.out.println("Qual a medida do lado do quadrado:");
lado= teclado.nextDouble();
area= lado*lado;
System.out.println("a area do quadrado e:" + area );
}
}

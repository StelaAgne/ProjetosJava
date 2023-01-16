import java.util.Scanner;

public class Veiculo {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
Double km, litros, media;
System.out.println("Digite a sua kilometragem:");
km = teclado.nextDouble();
System.out.println("Quantos litros?");
litros = teclado.nextDouble();
media = km/litros;
System.out.println("a media de km por litro e " + media);
}
}

import java.util.Scanner;

public class Quadrado {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double l, a;
	System.out.println("Por favor, informe o valor do lado");
	l = teclado.nextDouble();
	a = l * l;
	System.out.println("A área do quadrado é: " + a);
}
}

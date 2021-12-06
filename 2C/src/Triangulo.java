import java.util.Scanner;

public class Triangulo {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a, b, al;
	System.out.println("Por favor, informe o valor da base: ");
	b = teclado.nextDouble();
	System.out.println("Por favor, informe o valor da altura:");
	al = teclado.nextDouble();
	a = b * al /2;
	System.out.println("A área do triângulo é: " + a);
}

}

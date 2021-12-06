import java.util.Scanner;

public class Retangulo {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double al, b, a;
	System.out.println("Por favor, informe o valor da altura");
	al = teclado.nextDouble();
	System.out.println("Por favor, informe o valor da base");
	b = teclado.nextDouble();
	a = b * al;
	System.out.println("O cálculo é: " + a);
}
}

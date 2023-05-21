/**
 * 
 */
package exercicio8;
import java.util.Scanner;
/**
 * @author Salatiel Galvão Zambelino
 * Leia dois números inteiros, a e b, e imprima o seu produto e o
 * quociente de a por b.
 */
public class ProdutoeQuociente {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
	    double b;
		double produto;
		double quociente;
		
		System.out.print("Digite um número: ");
		a = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		b = sc.nextDouble();
		
		produto = a * b;
		quociente = a / b;
		
		System.out.println("O Produto é " + produto);
		System.out.printf("O Quociente é %.2f%n", quociente);
		
		sc.close();

	}

}

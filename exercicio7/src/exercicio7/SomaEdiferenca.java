/**
 * 
 */
package exercicio7;
import java.util.Scanner;
/**
 * @author Salatiel Galvão Zambelino
 * Leia dois números inteiros e imprima a soma e a diferença entre
 * eles.
 */
public class SomaEdiferenca {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int soma, diferenca;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		
		
		soma = n1 + n2;
		diferenca = n1 - n2;
		
		System.out.println(soma);
		System.out.println(diferenca);
		sc.close();


	}

}

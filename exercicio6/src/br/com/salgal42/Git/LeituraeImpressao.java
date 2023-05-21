/**
 * 
 */
package br.com.salgal42.Git;
import java.util.Scanner;
/**
 * @author Salatiel Galvão Zambelino
 * Construa um programa que leia o nome, CPF, o endereço, o telefone e
 * imprima.
 */
public class LeituraeImpressao {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String cpf;
		String telefone;
		String endereco;		 
		
		nome = sc.nextLine();
		endereco = sc.nextLine();
		cpf = sc.nextLine();
		telefone = sc.nextLine();
		
		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(cpf);
		System.out.println(telefone);
		
		sc.close();   
		

	}

}

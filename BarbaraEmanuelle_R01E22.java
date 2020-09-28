		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Faça um algoritmo que leia dois valores numéricos e armazene nas variáveis A e B, após isso, efetue a troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. 
      //Imprima os valores após troca.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memória 
		int numA, numB, neuA, neuB;
		
		//entrada
		System.out.println("Digite um número para Biene: ");
		numA = scan.nextInt();
		
		System.out.println("Digite um segundo número: Rosa");
		numB = scan.nextInt();
		
		//processamento 
		neuB = numA;
		neuA = numB;
		
		System.out.println("Feita a inversão dos valores, o número de Biene agora para ser "+neuA+" e o novo número de Rosa passar ser: "+neuB);
		
		scan.close();
	}

}

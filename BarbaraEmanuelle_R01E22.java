		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Fa�a um algoritmo que leia dois valores num�ricos e armazene nas vari�veis A e B, ap�s isso, efetue a troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. 
      //Imprima os valores ap�s troca.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//mem�ria 
		int numA, numB, neuA, neuB;
		
		//entrada
		System.out.println("Digite um n�mero para Biene: ");
		numA = scan.nextInt();
		
		System.out.println("Digite um segundo n�mero: Rosa");
		numB = scan.nextInt();
		
		//processamento 
		neuB = numA;
		neuA = numB;
		
		System.out.println("Feita a invers�o dos valores, o n�mero de Biene agora para ser "+neuA+" e o novo n�mero de Rosa passar ser: "+neuB);
		
		scan.close();
	}

}

		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Faça um programa que receba de entrada um número real, encontre e mostre:
      //a. A parte inteira desse número;
      //b. A parte fracionária desse número.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria: 
		double numero, parteFrac;
		int parteInteira;
		
		//entrada
		numero = scan.nextDouble();
		
		//processamento
		parteInteira = (int) numero;
		parteFrac = numero - parteInteira;
		
		//saída
		System.out.printf("Parte inteira desse número %d parte fracionária %.2f", parteInteira, parteFrac );

		scan.close();
	}

}

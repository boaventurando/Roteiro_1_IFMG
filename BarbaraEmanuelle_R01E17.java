		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Fa�a um programa que receba de entrada um n�mero real, encontre e mostre:
      //a. A parte inteira desse n�mero;
      //b. A parte fracion�ria desse n�mero.
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
		
		//sa�da
		System.out.printf("Parte inteira desse n�mero %d parte fracion�ria %.2f", parteInteira, parteFrac );

		scan.close();
	}

}

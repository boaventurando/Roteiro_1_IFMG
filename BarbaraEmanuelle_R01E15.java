		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Fa�a um algoritmo que calcule a �rea de uma circunfer�ncia, recebendo o valor do raio. Obs.: Defina PI como constante de valor 3.1416.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//memoria 
		double area, raio;

		final double  pi = 3.1416;
		System.out.print("Digite o valor do raio: ");
		raio = scan.nextDouble();
		
		//processamento 
		
		area = (raio * raio) * pi;
		//sa�da 
		System.out.printf("A �rea do deste c�rculo � %.2f", area);
		
		scan.close();
	}

}

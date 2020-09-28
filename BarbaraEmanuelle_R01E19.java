		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      // Implemente m programa que receba um número positivo, calcule e mostre:
      // O número digitado elevado ao quadrado;
      // O número digitado elevado ao cubo;
      // A raiz quadrada do número;
      // A raiz cúbica do número.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero,resultadoQuadrado,resultadoRaiz,resultadoCubico,resultadoRaizCubica;
		
		System.out.println("Informe um número ");
		numero = scan.nextDouble();
		
		resultadoQuadrado = Math.pow(numero,2);
		resultadoRaiz = Math.sqrt(numero);
		resultadoCubico = Math.pow(numero,3);
		resultadoRaizCubica = Math.cbrt(numero);
		
		System.out.println("A raiz quadrada de "+numero+" é "+resultadoRaiz+" e elevado ao quadrado é "+resultadoQuadrado+"\nA raiz cubica de "+numero+" é "
				+resultadoRaizCubica+" e o mesmo número elevado ao cubo é "+resultadoCubico);
		
		scan.close();
	}

}

		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      // Implemente m programa que receba um n�mero positivo, calcule e mostre:
      // O n�mero digitado elevado ao quadrado;
      // O n�mero digitado elevado ao cubo;
      // A raiz quadrada do n�mero;
      // A raiz c�bica do n�mero.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero,resultadoQuadrado,resultadoRaiz,resultadoCubico,resultadoRaizCubica;
		
		System.out.println("Informe um n�mero ");
		numero = scan.nextDouble();
		
		resultadoQuadrado = Math.pow(numero,2);
		resultadoRaiz = Math.sqrt(numero);
		resultadoCubico = Math.pow(numero,3);
		resultadoRaizCubica = Math.cbrt(numero);
		
		System.out.println("A raiz quadrada de "+numero+" � "+resultadoRaiz+" e elevado ao quadrado � "+resultadoQuadrado+"\nA raiz cubica de "+numero+" � "
				+resultadoRaizCubica+" e o mesmo n�mero elevado ao cubo � "+resultadoCubico);
		
		scan.close();
	}

}

		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      // Considere uma equa��o do segundo grau na forma gen�rica (ax2 + bx + c) e calcule o valor das ra�zes da mesma. 
      //Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usu�rio. Utilize as equa��es abaixo como teste. 
      //Teste tamb�m para alguns valores aleat�rios de coeficientes (exemplo a = 3, b = 2 e c =4) e veja que em alguns casos n�o se retornam as ra�zes de forma correta. 
      // Identifique o porqu� desse problema e indique uma poss�vel solu��o.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria 
		double coA, coB, coC, delta, x1, x2;
		
		//entrada 
		
		System.out.println("Digite o valor de A: ");
		coA = scan.nextDouble();
		System.out.println("Digite o valor de B: ");
		coB = scan.nextDouble();
		System.out.println("Digite o valor de C: ");
		coC = scan.nextDouble();
			
		//processamento 
		delta = Math.pow(coB, 2) - 4 * coA * coC;
		x1 = (-coB + Math.sqrt(delta)) / (2 * coA);
		x2 = (-coB - Math.sqrt(delta)) / (2 * coA);

		//sa�da 
		System.out.printf("O resultato da equa��o de X1 %.1f e o resultado da equa��o de X2 %.1f ", x1, x2); 
		
		scan.close();

	}

}

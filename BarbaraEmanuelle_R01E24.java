		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      // Considere uma equação do segundo grau na forma genérica (ax2 + bx + c) e calcule o valor das raízes da mesma. 
      //Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usuário. Utilize as equações abaixo como teste. 
      //Teste também para alguns valores aleatórios de coeficientes (exemplo a = 3, b = 2 e c =4) e veja que em alguns casos não se retornam as raízes de forma correta. 
      // Identifique o porquê desse problema e indique uma possível solução.
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

		//saída 
		System.out.printf("O resultato da equação de X1 %.1f e o resultado da equação de X2 %.1f ", x1, x2); 
		
		scan.close();

	}

}

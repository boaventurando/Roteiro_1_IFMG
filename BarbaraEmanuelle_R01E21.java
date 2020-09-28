		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Fa�a um programa que receba a medida do �ngulo formado por uma escada apoiada e a altura da parede. Calcule e mostre a medida da escada para que a ponta da parede possa ser alcan�ada.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria 
		double radiano, anguloF, alturaParede, escada;
		
		//entrada
		System.out.println("Qual o angulo formado pela escada?: ");
		anguloF = scan.nextDouble();
		System.out.println("Qual a altura da parede?: ");
		alturaParede = scan.nextDouble();
		
		//processamento
		radiano = anguloF * 3.14/180;
		escada = alturaParede / Math.sin(radiano);
		
		//sa�da
		System.out.printf("A escada deve ter %.2f metros de altura", escada);
		
		scan.close();
	}

}

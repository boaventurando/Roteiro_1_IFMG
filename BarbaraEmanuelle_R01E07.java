		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Faça um algoritmo que calcule a área e o perímetro de um retângulo recebendo de entrada os valores dos lados.
package roteiro01;

import java.util.Scanner;

public class BarbaraEmanuelle_R01E07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria
		double altura,base,area,perimetro; 
		
		//entrada
		System.out.println("Digite a altura do retângulo: ");
		altura = scan.nextDouble();
		
		System.out.println("Digite a base do retângulo: ");
		base = scan.nextDouble();
		
		 //processamento 
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		//saída 
		System.out.printf("Com os valores informados, a área do retângulo é %.0f e o perímetro é %.0f",area, perimetro);

		scan.close(); 
	}

}

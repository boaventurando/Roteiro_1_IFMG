		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Fa�a um algoritmo que calcule a �rea e o per�metro de um ret�ngulo recebendo de entrada os valores dos lados.
package roteiro01;

import java.util.Scanner;

public class BarbaraEmanuelle_R01E07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria
		double altura,base,area,perimetro; 
		
		//entrada
		System.out.println("Digite a altura do ret�ngulo: ");
		altura = scan.nextDouble();
		
		System.out.println("Digite a base do ret�ngulo: ");
		base = scan.nextDouble();
		
		 //processamento 
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		//sa�da 
		System.out.printf("Com os valores informados, a �rea do ret�ngulo � %.0f e o per�metro � %.0f",area, perimetro);

		scan.close(); 
	}

}

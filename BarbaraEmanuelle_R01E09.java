		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Implemente um algoritmo que receba o número de lados de um polígono convexo regular, calcule e mostre
      //o número de diagonais desse polígono. 
            
package roteiro01;

import java.util.Scanner;

public class BarbaraEmanuelle_R01E09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria 
		int numeroLados, numDiagonais;
		
		//entrada 
		System.out.println("Informa o número de lados desse polígono convexo regular: ");
		numeroLados = scan.nextInt();
		
		//processamento 
		
		numDiagonais = numeroLados * (numeroLados - 3) /2 ;
		
		//saída 
		System.out.println("Este polígono possui "+ numDiagonais +" diagonais");
		
		scan.close();
		
	}

}

		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Implemente um algoritmo que receba o n�mero de lados de um pol�gono convexo regular, calcule e mostre
      //o n�mero de diagonais desse pol�gono. 
            
package roteiro01;

import java.util.Scanner;

public class BarbaraEmanuelle_R01E09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria 
		int numeroLados, numDiagonais;
		
		//entrada 
		System.out.println("Informa o n�mero de lados desse pol�gono convexo regular: ");
		numeroLados = scan.nextInt();
		
		//processamento 
		
		numDiagonais = numeroLados * (numeroLados - 3) /2 ;
		
		//sa�da 
		System.out.println("Este pol�gono possui "+ numDiagonais +" diagonais");
		
		scan.close();
		
	}

}

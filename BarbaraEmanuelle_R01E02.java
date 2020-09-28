		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Implemente um algoritmo que leia um número inteiro e imprima seu antecessor e seu sucessor.
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E02 {
		    public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int numero, antecessor,sucessor;
		    
		        System.out.println("Escolha um número: ");
		        numero = scan.nextInt();
		        sucessor = numero + 1;
		        antecessor = numero - 1;
		        
		        System.out.printf("O antecessor do número escolhido ("+numero+") é " + antecessor + " e seu sucessor é " + sucessor+".");
		        
		        scan.close();
		        
		    }

	}
		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Implemente um algoritmo que leia um n�mero inteiro e imprima seu antecessor e seu sucessor.
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E02 {
		    public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int numero, antecessor,sucessor;
		    
		        System.out.println("Escolha um n�mero: ");
		        numero = scan.nextInt();
		        sucessor = numero + 1;
		        antecessor = numero - 1;
		        
		        System.out.printf("O antecessor do n�mero escolhido ("+numero+") � " + antecessor + " e seu sucessor � " + sucessor+".");
		        
		        scan.close();
		        
		    }

	}
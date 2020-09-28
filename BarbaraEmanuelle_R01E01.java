		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
		// Crie um algoritmo que calcule a soma e a média de 3 números passados pelo usuário.
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E01 {
		    public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    double numero1, numero2,numero3, media;
		    
		        System.out.println("Digite três números [aperte ENTER ao digitar]");
		        numero1 = scan.nextDouble();
		        numero2 = scan.nextDouble();
		        numero3 = scan.nextDouble();
		        media = (numero1 + numero2 + numero3) / 3;
		        
		        System.out.printf("A média dos números escolhidos é: %.2f", media);
		        
		        scan.close();

		        
		    }

	}



		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      
      //Implemente um algoritmo que receba 3 números reais de entrada. 
      //Calcule e mostre o resultado da multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário. 
      //Sabe-se que o denominador não pode ser zero, mas neste momento não se preocupe com as validações.
      
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E03 {

	public static void main(String[] args) {
	      double numero1, numero2, numero3,resultado;
	      Scanner scan = new Scanner(System.in);
	     
	        System.out.println("Digite três números [aperte o enter toda vez que digitar um novo número]");
	        numero1 = scan.nextDouble();
	        numero2 = scan.nextDouble();
	        
	        System.out.println("O próximo número NÃO pode ser ZERO");
	        numero3 = scan.nextDouble();

	        resultado = numero1 * numero2 / numero3;
	        
	    if (numero3 == 0) {
	        System.out.println("A operação não pode ser realizada pois o último número informado foi ZERO");
	    }
	    else {
	        System.out.printf("Quando se multiplica %.0f por %.0f e divide por %.0f o resultado é %.0f", numero1,numero2,numero3,resultado);
	    }
		scan.close();
	}
	    

}


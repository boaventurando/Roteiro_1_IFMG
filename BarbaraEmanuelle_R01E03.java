		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      
      //Implemente um algoritmo que receba 3 n�meros reais de entrada. 
      //Calcule e mostre o resultado da multiplica��o dos dois primeiros n�meros dividido pelo terceiro n�mero fornecido pelo usu�rio. 
      //Sabe-se que o denominador n�o pode ser zero, mas neste momento n�o se preocupe com as valida��es.
      
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E03 {

	public static void main(String[] args) {
	      double numero1, numero2, numero3,resultado;
	      Scanner scan = new Scanner(System.in);
	     
	        System.out.println("Digite tr�s n�meros [aperte o enter toda vez que digitar um novo n�mero]");
	        numero1 = scan.nextDouble();
	        numero2 = scan.nextDouble();
	        
	        System.out.println("O pr�ximo n�mero N�O pode ser ZERO");
	        numero3 = scan.nextDouble();

	        resultado = numero1 * numero2 / numero3;
	        
	    if (numero3 == 0) {
	        System.out.println("A opera��o n�o pode ser realizada pois o �ltimo n�mero informado foi ZERO");
	    }
	    else {
	        System.out.printf("Quando se multiplica %.0f por %.0f e divide por %.0f o resultado � %.0f", numero1,numero2,numero3,resultado);
	    }
		scan.close();
	}
	    

}


		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //A copa do mundo de futebol da FIFA � uma competi��o internacional que iniciou em 1930, acontecendo
      //desde ent�o de 4 em 4 anos, exceto durante o per�odo das guerras mundiais que impossibilitaram a
      //realiza��o 2 copas mundiais. Sabendo dessas informa��es, fa�a um algoritmo em JAVA que dado o ano
      //atual calcule o n�mero de copas j� realizadas e exiba o resultado ao usu�rio.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E13 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
         
		 
          int anoAtual, edicoes;
          
          System.out.println("Digite ano atual: ");
          anoAtual = scan.nextInt();
          
          edicoes = (anoAtual - 1930) / 4 - 1;
          
          if (anoAtual == 1930) {
        	  
        	  edicoes = edicoes + 2;
              System.out.printf("No ano informado a Copa do Mundo est� em sua \n "+edicoes+" � edi��o");

          } else {
          
              System.out.printf("No ano informado a Copa do Mundo est� em sua \n "+edicoes+" � edi��o");
              }
          scan.close();
          
	}
}

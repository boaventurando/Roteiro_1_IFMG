		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
      //desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
      //realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
      //atual calcule o número de copas já realizadas e exiba o resultado ao usuário.
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
              System.out.printf("No ano informado a Copa do Mundo está em sua \n "+edicoes+" º edição");

          } else {
          
              System.out.printf("No ano informado a Copa do Mundo está em sua \n "+edicoes+" º edição");
              }
          scan.close();
          
	}
}

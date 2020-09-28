		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do sal�rio m�nimo. Fa�a um
      //algoritmo que receba o valor atual do sal�rio m�nimo e a quantidade de quilowatt consumida em uma resid�ncia, calcule e mostre:
      //a. O valor pago por quilowatt;
      //b. O valor a ser pago pelo consumo nessa resid�ncia;
      //c. O valor a ser pago considerando um desconto de 15%.
package roteiro01;

import java.util.*;

	   public class BarbaraEmanuelle_R01E18 {
	      public static void main(String [] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      //memoria
	      double salario, valorQuilowatts, quilowattsConsumido, valorASerPago, desconto,restanteSalario;
	      
	      //entrada
	      System.out.print("Digite o sal�rio: ");
	      salario = scan.nextDouble();
	      valorQuilowatts = salario / 5;
	      System.out.print("Digite o quilowatts consumido no m�s: ");
	      quilowattsConsumido = scan.nextDouble();
	      
	      //processamento
	      valorASerPago = quilowattsConsumido * valorQuilowatts;
	      desconto =  valorASerPago * 0.15;
	      restanteSalario = valorASerPago - desconto; 
	      
	      //sa�da
	      System.out.print("Valor pago por quilowatt: " + valorQuilowatts + "\n Quilowatts consumido: "+ quilowattsConsumido + " \n Desconto dispon�vel de: "
	      + desconto + " reais. \n Total da conta: " +restanteSalario);
	      
	      
	      scan.close();

	   }
}

		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do salário mínimo. Faça um
      //algoritmo que receba o valor atual do salário mínimo e a quantidade de quilowatt consumida em uma residência, calcule e mostre:
      //a. O valor pago por quilowatt;
      //b. O valor a ser pago pelo consumo nessa residência;
      //c. O valor a ser pago considerando um desconto de 15%.
package roteiro01;

import java.util.*;

	   public class BarbaraEmanuelle_R01E18 {
	      public static void main(String [] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      //memoria
	      double salario, valorQuilowatts, quilowattsConsumido, valorASerPago, desconto,restanteSalario;
	      
	      //entrada
	      System.out.print("Digite o salário: ");
	      salario = scan.nextDouble();
	      valorQuilowatts = salario / 5;
	      System.out.print("Digite o quilowatts consumido no mês: ");
	      quilowattsConsumido = scan.nextDouble();
	      
	      //processamento
	      valorASerPago = quilowattsConsumido * valorQuilowatts;
	      desconto =  valorASerPago * 0.15;
	      restanteSalario = valorASerPago - desconto; 
	      
	      //saída
	      System.out.print("Valor pago por quilowatt: " + valorQuilowatts + "\n Quilowatts consumido: "+ quilowattsConsumido + " \n Desconto disponível de: "
	      + desconto + " reais. \n Total da conta: " +restanteSalario);
	      
	      
	      scan.close();

	   }
}

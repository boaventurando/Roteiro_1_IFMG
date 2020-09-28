//Barbara E. Boaventura e Souza 
//BSI2020 - IFMG 
//Funcionários da IFVende tem como benefício a receber ao final de cada mês um salário fixo mais 4% de
//comissão sobre as vendas realizadas pelo mesmo. Assim, faça um algoritmo que receba o salário fixo e o
//valor de vendas realizadas por um funcionário, calcule e mostre o benefício a ser recebido pelo mesmo.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E06 {
   public static void main(String [] args) {
	   Scanner scan = new Scanner(System.in);
	   //memoria
	   double salario,vendas,comissaoAReceber,salarioAReceber;
   
	   //entrada
	   System.out.print("Digite o salário base do funcionário: ");
	   salario = scan.nextDouble();
	   System.out.print("Digite o valor total de vendas do funcionário: ");
	   vendas = scan.nextDouble();
   
	   //processamento
	   comissaoAReceber = vendas * 0.04;
	   salarioAReceber = comissaoAReceber + salario;
   
	   //saída
	   System.out.printf("Total a receber é: %.2f",salarioAReceber);
   
	   scan.close();  

   }
}
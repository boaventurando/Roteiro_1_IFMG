//Barbara E. Boaventura e Souza 
//BSI2020 - IFMG 
//Funcion�rios da IFVende tem como benef�cio a receber ao final de cada m�s um sal�rio fixo mais 4% de
//comiss�o sobre as vendas realizadas pelo mesmo. Assim, fa�a um algoritmo que receba o sal�rio fixo e o
//valor de vendas realizadas por um funcion�rio, calcule e mostre o benef�cio a ser recebido pelo mesmo.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E06 {
   public static void main(String [] args) {
	   Scanner scan = new Scanner(System.in);
	   //memoria
	   double salario,vendas,comissaoAReceber,salarioAReceber;
   
	   //entrada
	   System.out.print("Digite o sal�rio base do funcion�rio: ");
	   salario = scan.nextDouble();
	   System.out.print("Digite o valor total de vendas do funcion�rio: ");
	   vendas = scan.nextDouble();
   
	   //processamento
	   comissaoAReceber = vendas * 0.04;
	   salarioAReceber = comissaoAReceber + salario;
   
	   //sa�da
	   System.out.printf("Total a receber �: %.2f",salarioAReceber);
   
	   scan.close();  

   }
}
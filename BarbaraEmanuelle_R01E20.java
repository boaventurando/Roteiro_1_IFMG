		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
      // a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
      //b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
      //c) O salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
      //d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago por hora extra;
      //e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E20 {
    public static void main(String [] args) {
    	Scanner scan = new Scanner(System.in);
    
    	//memoria
    	double salarioMinimo, quantidadeHoraTrabalhada, valorHora,valorHoraTrabalhada, salarioAReceber, valorHE, quantidadeHE,valorHEreceber,possuiHE; 
 
    	//entrada
    	System.out.print("Qual o salário mínimo? "); 
    	salarioMinimo = scan.nextDouble();
 
    	System.out.print("Digite quantidade horas trabalhadas: "); 
    	quantidadeHoraTrabalhada = scan.nextDouble();
 
    	//processamento 
    	valorHora = 0.12 * salarioMinimo;
    	valorHoraTrabalhada = valorHora * quantidadeHoraTrabalhada;
    	salarioAReceber = valorHoraTrabalhada + salarioMinimo;

    	System.out.print("Funcionário possui hora extra?  [1] para SIM [2] para NÃO ");
    	possuiHE = scan.nextDouble();
 

    	boolean opcaoUm = possuiHE == 1;
    	
    	//saída
    	if (opcaoUm) {
    		System.out.print("Quantas HE o funcionário tem? : ");
    		quantidadeHE = scan.nextDouble();
       
    		valorHE = salarioMinimo * 0.25;
    		valorHEreceber = valorHE * quantidadeHE; 
        
    		salarioAReceber = valorHoraTrabalhada + salarioMinimo + valorHEreceber;
        
    		System.out.print("EXTRATO DE PAGAMENTO: \nHORAS TRABALHADAS: " 
    				+ quantidadeHoraTrabalhada + " \nQUANTIDADE DE HORA EXTRA: " + quantidadeHE + 
    				"\nTOTAL A RECEBER: " + salarioAReceber);
  
    	 } else {
    		salarioAReceber = salarioMinimo + valorHoraTrabalhada; 
    
    		System.out.format("EXTRATO DE PAGAMENTO: \nHORAS TRABALHADAS: %.2f \nTOTAL A RECEBER: %.2f \nFUNCIONÁRIO NÃO POSSUI HE",quantidadeHoraTrabalhada, salarioAReceber); 
	
    	}
    	
    	scan.close();   
    }
}

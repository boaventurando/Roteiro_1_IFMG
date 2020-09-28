		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Fa�a um algoritmo que receba o n�mero de horas trabalhadas, o valor do sal�rio m�nimo e o n�mero de horas extras trabalhadas. Calcule e mostre o sal�rio a receber seguindo as seguintes regras:
      // a) O valor a ser pago por hora trabalhada � 0.125 do sal�rio m�nimo;
      //b) O valor a ser pago por hora extra vale 0.25 do sal�rio m�nimo;
      //c) O sal�rio bruto equivale ao n�mero de horas trabalhadas vezes o valor pago por hora;
      //d) a quantia a receber por horas extras equivale � horas extras realizadas multiplicado pelo valor pago por hora extra;
      //e) o sal�rio a receber equivale � soma do sal�rio bruto mais a quantia a receber pelas horas extras.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E20 {
    public static void main(String [] args) {
    	Scanner scan = new Scanner(System.in);
    
    	//memoria
    	double salarioMinimo, quantidadeHoraTrabalhada, valorHora,valorHoraTrabalhada, salarioAReceber, valorHE, quantidadeHE,valorHEreceber,possuiHE; 
 
    	//entrada
    	System.out.print("Qual o sal�rio m�nimo? "); 
    	salarioMinimo = scan.nextDouble();
 
    	System.out.print("Digite quantidade horas trabalhadas: "); 
    	quantidadeHoraTrabalhada = scan.nextDouble();
 
    	//processamento 
    	valorHora = 0.12 * salarioMinimo;
    	valorHoraTrabalhada = valorHora * quantidadeHoraTrabalhada;
    	salarioAReceber = valorHoraTrabalhada + salarioMinimo;

    	System.out.print("Funcion�rio possui hora extra?  [1] para SIM [2] para N�O ");
    	possuiHE = scan.nextDouble();
 

    	boolean opcaoUm = possuiHE == 1;
    	
    	//sa�da
    	if (opcaoUm) {
    		System.out.print("Quantas HE o funcion�rio tem? : ");
    		quantidadeHE = scan.nextDouble();
       
    		valorHE = salarioMinimo * 0.25;
    		valorHEreceber = valorHE * quantidadeHE; 
        
    		salarioAReceber = valorHoraTrabalhada + salarioMinimo + valorHEreceber;
        
    		System.out.print("EXTRATO DE PAGAMENTO: \nHORAS TRABALHADAS: " 
    				+ quantidadeHoraTrabalhada + " \nQUANTIDADE DE HORA EXTRA: " + quantidadeHE + 
    				"\nTOTAL A RECEBER: " + salarioAReceber);
  
    	 } else {
    		salarioAReceber = salarioMinimo + valorHoraTrabalhada; 
    
    		System.out.format("EXTRATO DE PAGAMENTO: \nHORAS TRABALHADAS: %.2f \nTOTAL A RECEBER: %.2f \nFUNCION�RIO N�O POSSUI HE",quantidadeHoraTrabalhada, salarioAReceber); 
	
    	}
    	
    	scan.close();   
    }
}

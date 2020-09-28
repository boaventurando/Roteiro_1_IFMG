		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
      //sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto
      //sobre o valor acumulado (salário base + gratificação).
      
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E05 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
		//memoria
		double salarioBase,gratificacao,salarioNovo,salarioAReceber,imposto;
		
	    //entrada
        System.out.print("Digite o salário base do funcionário: ");
        salarioBase = scan.nextDouble();
        
        //processamento 
        gratificacao = salarioBase * 0.10 ;
        salarioNovo = salarioBase + gratificacao;
        imposto = salarioNovo * 0.05;
        salarioAReceber = salarioNovo - imposto;
        
        //saída
        System.out.print("O salário total a receber é: "+salarioAReceber+ " \n valor detalhado: \n SALARIO BASE: "
                +salarioBase+ " \n GRATIFICAÇÃO: "+ gratificacao+" \n IMPOSTO: "+imposto+ "\n TOTAL: "+ salarioAReceber);
        
                
        scan.close();
    }
    
}

		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e mostre o sal�rio a receber,
      //sabendo que esse funcion�rio possui uma gratifica��o de 10% sobre o sal�rio base e paga 5% de imposto
      //sobre o valor acumulado (sal�rio base + gratifica��o).
      
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E05 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
		//memoria
		double salarioBase,gratificacao,salarioNovo,salarioAReceber,imposto;
		
	    //entrada
        System.out.print("Digite o sal�rio base do funcion�rio: ");
        salarioBase = scan.nextDouble();
        
        //processamento 
        gratificacao = salarioBase * 0.10 ;
        salarioNovo = salarioBase + gratificacao;
        imposto = salarioNovo * 0.05;
        salarioAReceber = salarioNovo - imposto;
        
        //sa�da
        System.out.print("O sal�rio total a receber �: "+salarioAReceber+ " \n valor detalhado: \n SALARIO BASE: "
                +salarioBase+ " \n GRATIFICA��O: "+ gratificacao+" \n IMPOSTO: "+imposto+ "\n TOTAL: "+ salarioAReceber);
        
                
        scan.close();
    }
    
}

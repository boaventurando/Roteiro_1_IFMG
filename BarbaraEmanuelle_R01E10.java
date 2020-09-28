		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao mês. Essa pessoa
      //gostaria de saber qual o total acumulado após 2 anos. Faça um programa que forneça tais informações.
      //(Obs. desconsidere correção monetária e utilize a fórmula de juros compostos).
package roteiro01;

public class BarbaraEmanuelle_R01E10 {

	public static void main(String[] args) {
		//memoria
		double montante, capital,taxaFixa,periodo,taxaXtempo;
		
		//entrada 
		capital = 2000;
		
		periodo = 24;
		taxaFixa = 0.05;
		
		//processamento 
 
		taxaXtempo = Math.pow(1 + taxaFixa, periodo);
		montante = capital * taxaXtempo;
		
		System.out.printf("O total acumulado depois desde período é de %.2f",montante);

	}

}

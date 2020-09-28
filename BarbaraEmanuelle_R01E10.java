		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao m�s. Essa pessoa
      //gostaria de saber qual o total acumulado ap�s 2 anos. Fa�a um programa que forne�a tais informa��es.
      //(Obs. desconsidere corre��o monet�ria e utilize a f�rmula de juros compostos).
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
		
		System.out.printf("O total acumulado depois desde per�odo � de %.2f",montante);

	}

}

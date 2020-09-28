		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Dona Maria das Couve � uma mulher muito preocupada com sua sa�de e busca a pr�tica de exerc�cios
      //f�sicos constantes. Devido a crise financeira, Dona Maria est� sem dinheiro para pagar academia, e teve
      //como alternativa fazer caminhada di�ria ao redor do quarteir�o de sua casa. O quarteir�o da casa dela
      //possui formato de um tri�ngulo ret�ngulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
      //km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
      //voltas Dona Maria precisa fazer no quarteir�o para que ela atinja sua meta.
      
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria 
		double quarteirao,ruaA,ruaB,ruaC,voltasDiarias,metaDiaria;
		
		//entrada
		System.out.println("Qual a sua meta em KM para caminhar diariamente? ");
		metaDiaria = scan.nextDouble();
		
		System.out.println("Qual o comprimento(em KM) da Rua A de uma esquina a outra? ");
		ruaA = scan.nextDouble();
		System.out.println("E d� Rua B(ainda em KM)? ");
		ruaB = scan.nextDouble();
		System.out.println("Pra finalizar, qual o comprimento da Rua C de uma esquina a outra? ");
		ruaC = scan.nextDouble();
		
		//processamento
		quarteirao = ruaA + ruaB + ruaC;
		voltasDiarias = metaDiaria / quarteirao;
		
		//sa�da 
		System.out.printf("Para voc� bater sua meta, seria necess�rio %.1f voltas ao redor do quarteir�o informado", voltasDiarias);
		
		scan.close();		

	}

}

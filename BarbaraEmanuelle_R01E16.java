		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Fa�a um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize divis�o inteira e resto da divis�o inteira).
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//memoria
		int horas, minutos,valor;
		
		//entrada
		System.out.println("Informe um valor: ");
		valor = scan.nextInt();
		
		//processamento 
		horas = valor / 60;
		minutos = valor % 60;
		
		//sa�da
		System.out.println("O n�mero informado equivale � "+horas+" horas e "+minutos+" minutos");
		
		scan.close();
	}

}

		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Sabe-se que, para iluminar corretamente os c�modos de uma casa, para cada m2, deve-se usar 18 W de
      //pot�ncia. Fa�a um programa que receba as dimens�es de um c�modo retangular (em metros), calcule e
      //mostre a �rea de mesmo (em m2) e a pot�ncia de ilumina��o necess�ria para iluminar corretamente o c�modo.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E14 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  
		  //memoria
	      float base,altura,area,ilumicacaoCorreta;
	      
	      //entrada
	      System.out.print("Digite o comprimento do c�modo (em metros): ");
	      base = scan.nextFloat();
	      System.out.print("Digite o largura do c�modo (em metros): ");
	      altura = scan.nextFloat();
	      
	      //processamento
	      area = base * altura;
	      ilumicacaoCorreta = area * 18;
	      
	      //sa�da
	      System.out.format("Uma vez que o tamanho do c�modo � de %.0fm�, para devida ilumina��o do ambiente � necess�rio uma lampada com %.0fW de pot�ncia",area,ilumicacaoCorreta);
	      
	      scan.close();
	      
	}
}


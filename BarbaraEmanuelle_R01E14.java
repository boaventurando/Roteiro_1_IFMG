		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      //Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m2, deve-se usar 18 W de
      //potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
      //mostre a área de mesmo (em m2) e a potência de iluminação necessária para iluminar corretamente o cômodo.
package roteiro01;

import java.util.*;

public class BarbaraEmanuelle_R01E14 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  
		  //memoria
	      float base,altura,area,ilumicacaoCorreta;
	      
	      //entrada
	      System.out.print("Digite o comprimento do cômodo (em metros): ");
	      base = scan.nextFloat();
	      System.out.print("Digite o largura do cômodo (em metros): ");
	      altura = scan.nextFloat();
	      
	      //processamento
	      area = base * altura;
	      ilumicacaoCorreta = area * 18;
	      
	      //saída
	      System.out.format("Uma vez que o tamanho do cômodo é de %.0fm², para devida iluminação do ambiente é necessário uma lampada com %.0fW de potência",area,ilumicacaoCorreta);
	      
	      scan.close();
	      
	}
}


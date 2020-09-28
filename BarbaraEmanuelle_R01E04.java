		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG 
      //Faça um algoritmo que receba 3 notas e seus respectivos pesos, calcule e mostre a media ponderada dessas notas.
      
package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E04 {

	public static void main(String[] args) {
			//memoria
	      double notaA, pesoA, notaB,pesoB,notaC,pesoC,mediaPeso,mediaNota,resultadoFinal;
	      Scanner scan = new Scanner(System.in);

	      //entrada
	      System.out.print("Informe a primeira nota: ");
	      notaA = scan.nextDouble();
	      System.out.print("qual o peso dessa matéria? ");
	      pesoA = scan.nextDouble();
	      
	      System.out.print("Informe a segunda nota: ");
	      notaB = scan.nextDouble();
	      System.out.print("qual o peso dessa matéria? ");
	      pesoB = scan.nextDouble();
	      
	      System.out.print("Informe a terceira nota: ");
	      notaC = scan.nextDouble();
	      System.out.print("qual o peso dessa matéria? ");
	      pesoC = scan.nextDouble();
	      
	      // processamento 
	      mediaPeso = pesoA + pesoB + pesoC;
	      mediaNota = notaA + notaB + notaC;
	      resultadoFinal = mediaNota / mediaPeso; 
	      
	      //saída

          System.out.format("A nota final é: \n %.2f", resultadoFinal);
	      
	  	scan.close();   
	}

}

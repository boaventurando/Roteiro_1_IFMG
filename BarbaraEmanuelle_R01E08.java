//Barbara E. Boaventura e Souza 
//BSI2020 - IFMG
//Z� Borba Gato � dono de um terreno na cidade de Sabar� e deseja saber qual seria o pre�o m�dio de venda
// desse terreno. Conforme visto na planta do mesmo, nota-se que o lote possui um formato de trap�zio.
//Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
//sabendo o valor m�dio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a �rea
//total e o valor m�dio de venda (R$) que Z� Borba Gato pode pedir pelo terreno.

package roteiro01;
import java.util.*;

public class BarbaraEmanuelle_R01E08 {
   public static void main(String [] args) {
	   Scanner scan = new Scanner(System.in);
	   
	    //memoria
	     double baseMaior,baseMenor,area,comprimento,valorPorMetro,valorTotalTerreno;
	     
         //entrada 
         System.out.println("Digite a base maior do terreno: ");
         baseMaior = scan.nextDouble();
         
         System.out.println("Digite a base menor do terreno: ");
      	 baseMenor = scan.nextDouble();
         
         System.out.println("Digite o comprimento do terreno: ");
         comprimento = scan.nextDouble();
         
         System.out.println("Digite o valor cobrado por metro� na regi�o: ");
      	 valorPorMetro = scan.nextDouble();
         
      	 //processamento 
      	 area =  baseMaior + baseMenor * comprimento / 2;
      	 
      	 //sa�da
         valorTotalTerreno = valorPorMetro * area;
         
         System.out.format("O valor m�dio do metro� na regi�o � "+valorPorMetro+ " reais, sendo ent�o o terreno avaliado em %.2f reais", valorTotalTerreno);
     
         scan.close();                
         
  }
   
}  

//Barbara E. Boaventura e Souza 
//BSI2020 - IFMG
//Zé Borba Gato é dono de um terreno na cidade de Sabará e deseja saber qual seria o preço médio de venda
// desse terreno. Conforme visto na planta do mesmo, nota-se que o lote possui um formato de trapézio.
//Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
//sabendo o valor médio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a área
//total e o valor médio de venda (R$) que Zé Borba Gato pode pedir pelo terreno.

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
         
         System.out.println("Digite o valor cobrado por metro² na região: ");
      	 valorPorMetro = scan.nextDouble();
         
      	 //processamento 
      	 area =  baseMaior + baseMenor * comprimento / 2;
      	 
      	 //saída
         valorTotalTerreno = valorPorMetro * area;
         
         System.out.format("O valor médio do metro² na região é "+valorPorMetro+ " reais, sendo então o terreno avaliado em %.2f reais", valorTotalTerreno);
     
         scan.close();                
         
  }
   
}  

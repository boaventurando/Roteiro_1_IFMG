		// Barbara E. Boaventura e Souza 
		// BSI2020 - IFMG package roteiro01;
      // Num dado momento, 3 canais de TV tinham, em sua programação, novelas em seu horário nobre: canal A,
      // novela A, canal B, novela B, canal C novela C. Numa pesquisa com 3000 pessoas, perguntou-se quais novela agradavam. A tabela a seguir mostra o resultado da pesquisa:
      // Implemente um algoritmo que encontre o número de telespectadores que nenhuma das novelas os agradam. Receba as informações de preferências na entrada de dados e utilize as fórmulas de teoria dos conjuntos.
package roteiro01;


public class BarbaraEmanuelle_R01E23 {

	public static void main(String[] args) {

		
		//memoria 
		int noveleiros,naoNoveleiros,telespectadores;
		int novelaA,novelaB,novelaC,novelas,novelasX;
		int AeC,AeB,BeC,AeBeC;
		
		//processamento 
		telespectadores = 3000;
		novelaA = 1450;
		novelaB = 1150;
		novelaC = 900;
		novelas = novelaA + novelaB + novelaC;
		
	
		AeB = 350;
		AeC = 400;
		BeC = 300;
		AeBeC = 100;
		novelasX = AeB + AeC + BeC;
		noveleiros = novelas - novelasX +  AeBeC;
		
		naoNoveleiros = telespectadores - noveleiros;
		
		//saída
		System.out.printf("Total de pessoas que assistem novela: "+noveleiros+"\nNúmero de pessas que não assistem nenhuma novela: "+ naoNoveleiros);

		
	}

}

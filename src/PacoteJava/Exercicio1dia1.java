package PacoteJava;

import java.util.Scanner;
public class Exercicio1dia1 {

	public static void main(String args[]) {
		
		int ano,dia,mes;
		double  totalDias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("Entre com a quantidade de ano(s): ");
		 ano=leia.nextInt();
		System.out.printf("Entre com a quantidade de dia(s): ");
		 dia=leia.nextInt();
		System.out.printf("Entre com a quantidade de mes(s): ");
		 mes=leia.nextInt();
		
		totalDias = (ano*365+mes*30+dia);
		
		System.out.println("\nEu tenho: "+ totalDias+ " dias de vida.");
		
		
		
	};
}

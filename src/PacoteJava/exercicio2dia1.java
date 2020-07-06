package PacoteJava;

import java.util.Scanner;
public class exercicio2dia1 {

	public static void main(String args[]){
		
		int ano, mes,dia,totalDias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("Entre com o total de dias:  ");
		 totalDias = leia.nextInt();
		
		 ano = (totalDias/365);
		 mes = (totalDias%365)/30;
		 dia = (totalDias%365)%30;
		 System.out.printf(" Eu tenho: " + ano+ " ANOS "+mes+ " meses "+dia+ " dias de vida");
	};
	
	
	
	
}

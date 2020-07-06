package PacoteJava;

import java.util.Scanner;
public class exercicio3 {

	public static void main(String args[]){
		
		
		Scanner leia = new Scanner (System.in);
		
		int hora,minutos,segundos, totalSegundos,totalMinutos;
				 
		 
		 System.out.printf("Entre com o total de segundos: ");
		 	totalSegundos = leia.nextInt();
		 
		 System.out.printf("Entre com o total de minutos: ");
		 	totalMinutos = leia.nextInt();
		 	
		 	hora = (totalSegundos/3600);
		 	minutos = (totalSegundos%3600)/60;
		 	segundos = (totalSegundos%3600)%60;
		 	
		 	System.out.println(hora);
		 	System.out.println(minutos);
		 	System.out.println(segundos);
		 	
	};

}

package PacoteJava;

import java.util.Scanner;
public class exercicio6 {

	public static void main(String args[]){

		Scanner leia = new Scanner (System.in);
		
		double x1,x2,y1,y2,  d, p1, p2;
		
		
		System.out.printf("Qual o valor de x1? ");
			x1 =leia.nextInt();
		System.out.printf("Qual o valor de x2? ");
		    x2 = leia.nextInt();
		System.out.printf("Qual o valor de y1? ");
		    y1=leia .nextInt();
		    
		System.out.printf("Qual o valor de y2? ");
			y2 =leia.nextInt();
			
		

		d =(Math.pow((x2-x1),2))+(Math.pow((y2-y1),2));
		d = Math.sqrt(d);
		
		System.out.printf("A dist�ncia entre os dois pontos � " +d);
		
	};
		
}

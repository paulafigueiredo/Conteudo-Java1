package PacoteJava;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String args[]){
	
		Scanner leia = new Scanner (System.in);
		
		float a, b, c, d , e ,f, x, y;
		
		
		System.out.printf("Digite o valor de A: ");
			a = leia.nextFloat();
		System.out.printf("Digite o valor de B: ");
			b =	leia.nextFloat();
		System.out.printf("Digite o valor de C: ");
			c =	leia.nextFloat();
		System.out.printf("Digite o valor de D: ");
			d = leia.nextFloat();
		System.out.printf("Digite o valor de E: ");
			e =	leia.nextFloat();
		System.out.printf("Digite o valor de F: ");
			f =	leia.nextFloat();
		
			x = ( ((c*e)-(b*f)) / (( a*e) -(b*d)) + 2);
			y = ( ((a*f)-(c*d)) / (( a*e)-(b*d)) + 2);
			
		System.out.printf(" O valor de X foi : "+ x);
			
			
	}
	
}

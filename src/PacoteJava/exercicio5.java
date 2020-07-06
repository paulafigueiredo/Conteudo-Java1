package PacoteJava;
import java.util.Scanner;
public class exercicio5 {
	 
	public static void main(String args[]){
		
		Scanner leia = new Scanner (System.in);
		
		 String nome;
		float n1,n2,n3, media;
		
			
		System.out.println("\nOlá, seja bem vindo!!  Digite seu nome: ");
		   nome = leia.next();
		
		System.out.println("Primeira nota: ");
			n1 = leia.nextFloat();
		System.out.println("Segunda nota: ");
			n2 = leia.nextFloat();
		System.out.println("Terceira nota: ");
			n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("\nA Media de "+ nome+ " Foi: " +media);
		
		
		
	};
		
	
}

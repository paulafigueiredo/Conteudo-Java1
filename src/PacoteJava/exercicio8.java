package PacoteJava;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String args[]){
	
		Scanner leia = new Scanner (System.in);
		
		int vPDistribuidor, vPrecoImp;
		float custoFabrica, valorDistribuidor, valorImposto, custoConsumidor;
		
		vPDistribuidor = 28;
		vPrecoImp = 45 ; 
		
		System.out.printf("Informe o valor de custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		valorDistribuidor = custoFabrica + (custoFabrica * vPDistribuidor / 100);
		valorImposto = custoFabrica + (custoFabrica * vPrecoImp / 100);
		custoConsumidor = custoFabrica + valorDistribuidor + valorImposto;
		
		System.out.printf("O custo ao consumidor é: "+custoConsumidor);
		
		
		
	}
	
}

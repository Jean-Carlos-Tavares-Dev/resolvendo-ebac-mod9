package br.modulo9;
import java.util.Scanner; 

public class Exemplo1 {
	
	

	public static void main (String args[]) {
		int numero;
		Scanner ler = new Scanner(System.in); 
		
		System.out.printf("informe o número:\n");
		numero = ler.nextInt();
		numero = Integer.valueOf(numero);
		System.out.println("Seu número é: "+ numero);
				
	}
}

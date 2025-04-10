package br.edu.principal;

import java.util.Scanner;

public class Principal {
//se media menor que 6 (Reprovado)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1, nota2, media;
		
		System.out.println("Digite a primeira nota:");
		nota1= sc.nextInt();
		 
		System.out.println("Digite a segunda nota:");
		nota2= sc.nextInt();
		 
		media = nota1 + nota2 / 2;
		
		
		if (media <= 5) {
		System.out.println("Voce esta reprovado");
		}
		
		else if (media > 6) {
		System.out.println("Voce esta reprovado");
		}
	
	
	}
}
package exercice;

import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		int a,b;
		String operateur;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir a :");
		a = sc.nextInt();
		
		System.out.println("Saisir un operateur : ");
		operateur = sc.next();
		char op = operateur.charAt(0);
		
		System.out.println("Saisir b");
		b = sc.nextInt();
		
		if(op == '+') {
			System.out.println("La somme de a et b est : "+ (a+b));
		}
		if(op == '-') {
			System.out.println("La differance entre a et b est : "+ (a - b));
		}
		if(op == '*') {
			System.out.println("Le produit de a et b est : "+ (a * b));
		}
		if(op == '/') {
			if(b!=0) {
				System.out.println("La division de a / b est : "+ (a / b));
			}else {
				System.out.println("Division immpossible!!!!!");
			}
		}
		
		

	}

}

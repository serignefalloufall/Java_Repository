package exercice;

import java.util.Scanner;

public class Exercice1 {
	
	public static void main(String[] args) {
		int a,b,q,r;
		double ratio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir l'entier a :");
		a = sc.nextInt();
		
		System.out.println("Veuillez saisir l'entier b :");
		b = sc.nextInt();
		
		if(b!=0)
		{
			System.out.println("Le resultat de la division entier entre a et b est : " + a / b);
			System.out.println("Le reste de la division entre a et b est : " + a % b);
			System.out.println("Le reste de la division reel entre a et b est : " + (float)a / (float)b);
			//ratio = float(a/b);
		}
		else {
			System.out.println("Division impossible ");

		}
		

	}

}

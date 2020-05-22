package exercice;

import java.util.Scanner;

public class Exercice7 {
	public static void main(String[] args) {
	int billetv, billetd, billetc;
	int pieced, pieceu;
	int rest,montant;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Saisir le montant a decomposer :");
	montant = sc.nextInt();
	
	billetv = montant / 20;
	//rest = montant % 20;
	
	billetd = billetv / 10;
	//rest = rest % 10;
	
	billetc = billetd / 5;
	//rest = rest % 5;
	
	pieced = billetc  / 2;
	//rest = rest % 2;
	
	pieceu=pieced/1;
	
	System.out.println("Le nombre de biellet 20 est :" +billetv);
	System.out.println("----------*****----------");
	
	System.out.println("Le nombre de biellet 10 est :" +billetd);
	System.out.println("----------*****----------");
	
	System.out.println("Le nombre de biellet 5 est :" +billetc);
	System.out.println("----------*****----------");
	
	System.out.println("Le nombre de piece de 2 est :" +pieced);
	System.out.println("----------*****----------");
	
	System.out.println("Le nombre de piece de 1 est :" +pieceu);
	
	}
}

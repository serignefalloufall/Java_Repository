package exercice;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		int i,n,som;
		som = 0;
		Scanner sc = new Scanner(System.in);
		for (int j = 1; j <= 5; j++) {
		 System.out.println("saisir un nombre");
		 n = sc.nextInt();
		 som = som+n;
		}
		 System.out.println("La somme des variable saisie est : "+ som);

	}

}

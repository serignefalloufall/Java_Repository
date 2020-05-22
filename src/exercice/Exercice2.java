package exercice;

import java.util.Locale;
import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		final double Pi = Math.atan(1);
		double rayon,surface,perimetre;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Veuillez saisir rayon :");
		rayon = sc.nextDouble();
		
	    //On vide la ligne avant d'en lire une autre
	    sc.nextLine();
	    
		surface = Pi*rayon*rayon;
		perimetre = 2*Pi*rayon;
		
		System.out.println("La surface est :"+ surface);
		System.out.println("Le Perimetre est :"+ perimetre);
	}

}

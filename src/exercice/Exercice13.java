package exercice;

import java.util.Scanner;

public class Exercice13 {

	public static void main(String[] args) {
		int jour,mois,annee;
		boolean bol=false;
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Saisir les prametre de la date (jour, mois, année)");
		jour=sc.nextInt();
		mois=sc.nextInt();
		annee=sc.nextInt();
		
	
				if(annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
					System.out.println("Est bissextil");
				}else {
					System.out.println("Non bissextil");
				}
		
		
	}

}

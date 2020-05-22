package exercice;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		double x1,x2,y1,y2;
		double distance;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****Les coordonnées de point A");
		System.out.println("Saisir x1");
		x1 = sc.nextDouble();
		System.out.println("Saisir y1");
		y1 = sc.nextDouble();
		

		System.out.println("*****Les coordonnées de point B");
		System.out.println("Saisir x2");
		x2 = sc.nextDouble();
		System.out.println("Saisir y2");
		y2 = sc.nextDouble();
		
		distance = Math.sqrt((x1 - x2 ) * 2 + (y1 - y2) * 2);
		System.out.println("La distance entre les 2 points A et B est : " + distance);
	}

}

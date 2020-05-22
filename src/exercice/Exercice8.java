package exercice;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		int a,b,c;
		int deltat,x,x1,x2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir a,b et c de l'equation ax2+bx+c = 0");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		deltat = (b*b)-4*(a*c);
		//System.out.println("Delta = "+deltat);
		if(deltat<0) {
			System.out.println("Pas de solution");
		}
		if(deltat>0) {
			x1 = (int) (-b - Math.sqrt(deltat)/2*a);
			x2 = (int) (-b + Math.sqrt(deltat)/2*a);
			System.out.println("Deltat positive donc il existe 2 solution x1 et x2");
			System.out.println("----------*****----------");
			System.out.println("X1 = "+ x1 +" X2 = "+ x2);
		}
		if(deltat==0) {
			x = (int) (-b/2*a);
			System.out.println("Deltat est null donc ona une seule solution ");
			System.out.println("----------*****----------");
			System.out.println("X = "+ x);
		}
		

	}

}

package exercice;

import java.util.Scanner;

public class Exercice4_V2 {

	
	public static void main(String[] args) {
		int x,n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisr x");
		x = sc.nextInt();
		System.out.println("Saisr n");
		n = sc.nextInt();
		
		System.out.println(x+" a la puissance "+n+" est "+ Math.pow(x, n));
		
	}
	
	
}

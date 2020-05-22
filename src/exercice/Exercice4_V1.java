package exercice;

import java.util.Scanner;

public class Exercice4_V1 {

	public static void main(String[] args) {
		int x,n,p;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisr x");
		x = sc.nextInt();
		System.out.println("Saisr n");
		n = sc.nextInt();
		
		p=1;
		for (int i = 1; i <= n; i++) {
			p = x*p;
		}
		//System.out.println(x+" a la puissance "+n+" est "+ Math.pow(x, n));
		System.out.println(x+" a la puissance "+n+" est "+ p);
	}

}

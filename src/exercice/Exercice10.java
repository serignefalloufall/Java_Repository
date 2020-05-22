package exercice;

import java.util.Scanner;

public class Exercice10 {
	

	static void permut(int a,int b) {
		int temp= a;
		a = b;
		b = temp;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Saisir les trois nombre a,bet c : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("La valeur de a , b et c avant permutation");
		System.out.println("a = "+a+" b = "+b+" c = " +c);
		
		
		
		if(a>b) {
			permut(a,b);//b plus grand 
			if(b>c) {
				permut(b, c);//c plus grand
				if(a>b) {
					permut(a, b);//b plus grand
					
				}
			}
		}else {
			if(b>c) {
				permut(b, c);//c plus grand
			}
			if(a>b) {
				permut(a, b);//b plus grand
			}
			System.out.println("La valeur de a ,et c apres permutation");
			System.out.println("a = "+a+" b = "+b+" c = " +c);
		}
		
		
		
	}
	
	

}

package exercice;

import java.util.Scanner;

public class Exercice12 {

	public static void main(String[] args) {
		int nombre, som;
		som=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		for (int j = 1; j <= nombre-1; j++) {
			if(nombre % j == 0) {
				som=som+j;
			}
		}
		if(som == nombre) {
			System.out.println(nombre+" est parfait");
		}else {
			System.out.println(nombre+" n'estpas  parfait");
		}

	}

}

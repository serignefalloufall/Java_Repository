package exercice;

import java.util.Locale;
import java.util.Scanner;

public class Exercice3_V1 {
	public static void main(String[] args) {
	
	double r1,r2,r3;
	double rp,rs;
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	System.out.println("Saisir r1");
	r1=sc.nextDouble();
	
	System.out.println("Saisir r2");
	r2=sc.nextDouble();
	
	System.out.println("Saisir r3");
	r3=sc.nextDouble();
	
	rs = r1+r2+r3;
	rp = (r1*r2*r3)/(r1*r2 + r2*r3 + r1*r3);
	
	System.out.println("Registance paralelle :" + rp);
	System.out.println("Registance sequence :" + rs);
	
}


}

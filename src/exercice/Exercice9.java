package exercice;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		int heure_depart, heure_arrive, minute_depart, minute_arrive;
		int dure_heur, dure_minute;
		
        Scanner sc = new Scanner(System.in);
        
	    System.out.println("Saisir les horaire de depart (heur depart et minute depart):");
	    heure_depart = sc.nextInt();
	    minute_depart = sc.nextInt();
	    
	    System.out.println("Saisir les horaire d'arrive (heur arrive et minute arrive):");
	    heure_arrive = sc.nextInt();
	    minute_arrive = sc.nextInt();
	    
	    if(heure_arrive >  heure_depart ) {
	    	//l'hypothes a
	    	if(minute_arrive>minute_depart) {
	    		
	    		dure_heur = heure_arrive-heure_depart;
	    		dure_minute = minute_arrive-minute_depart;
	    		System.out.println("La durre de vol est : "+dure_heur+"h:"+dure_minute+"mn");
	    		
	    	}else {
	    		 dure_heur = heure_arrive - heure_depart - 1;
		 	     dure_minute =minute_arrive + 60 - minute_depart;
		 	    System.out.println("La durre de vol est : "+dure_heur+"h:"+dure_minute+"mn");
	    	}
	    	
	    }else {
	    	//l'hypothes b
	    	if(minute_arrive>minute_depart) {
	    		dure_heur = heure_arrive - heure_depart+24;
			    dure_minute = minute_arrive - minute_depart;
			    System.out.println("La durre de vol est : "+dure_heur+"h:"+dure_minute+"mn");
	    	}else {
	    		 dure_heur = heure_arrive - heure_depart + 24 - 1;
		 	     dure_minute = minute_arrive + 60 - minute_depart;
		 	     System.out.println("La durre de vol est : "+dure_heur+"h:"+dure_minute+"mn");
	    	}
	    	
	    }


	}

}

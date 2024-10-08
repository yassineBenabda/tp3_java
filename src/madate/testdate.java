package madate;

import java.util.Scanner;

public class testdate {
    public static void main(String[] args) {

        madate d1 = new madate(11, 9, 2010);  
        madate d2 = new madate(1, 6, 2020); 
        madate d3 = new madate(2024);        

        d3.setjour(1);
        d3.setmois(1);

        System.out.println("Date 1: " + d1);
        System.out.println("Date 2: " + d2);
        System.out.println("Date 3: " + d3);

        Scanner s = new Scanner(System.in);
        boolean boucle = true;
        
        while (boucle) {
	        System.out.println("Choose an operation:");
	        System.out.println("1: Add one day");
	        System.out.println("2: Add several days");
	        System.out.println("3: Add one month");
	        System.out.println("4: Add one year");
	        System.out.println("5: Exit"); 
	        
	        int choice = s.nextInt();
	
	        if (choice == 5) {
	        	boucle = false;
	        	System.out.println("Exiting");
	        	break;
	        }
	        
	        System.out.println("Choose a date (1, 2, or 3):");
	        int dateChoice = s.nextInt();
	        madate selectedDate;
	        
	        if (dateChoice == 1) {
	            selectedDate = d1;
	        } else if (dateChoice == 2) {
	            selectedDate = d2;
	        } else {
	            selectedDate = d3;
	        }
	
	        switch (choice) {
	            case 1:
	                selectedDate.ajouterunjour();
	                break;
	            case 2:
	                System.out.println("How many days to add?");
	                int days = s.nextInt();
	                selectedDate.ajouterPlusieursJours(days);
	                break;
	            case 3:
	                selectedDate.ajouterunmoi();
	                break;
	            case 4:
	                selectedDate.ajouterunan();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                break;
	        }

        System.out.println("Updated date: " + selectedDate);
        }
        s.close();
    }
}

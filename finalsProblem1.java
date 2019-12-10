import java.util.Scanner;
public class finalsProblem1{
   public static void main (String[]args) {
       Scanner input = new Scanner(System.in);
       char choice; int num;			
       do {
         System.out.print("Enter a number to execute: ");  
	 do {             
	     while(!input.hasNextInt()) {
	      System.out.println("INVALID! TRY AGAIN");
	      input.next();				
	     }
             num=input.nextInt();
	     if (num<1||num>10) {
	         System.out.println("INVALID! TRY AGAIN");}							
	    } while(num<1||num>10 );				
        System.out.println();
	for(int i=0;i<=10;i++) {
	   for(int j = 1; j <= num; j++) {
	     System.out.print(j + " + " + i + " = " + (j+i) + "\t");}								
	     System.out.println();}
	do {
	     System.out.print("\nDO YOU WANT TO CONTINUE? <Y/N>: ");
	     choice=Character.toUpperCase(input.next().charAt(0)); 				
	     if (!(choice=='Y' ||choice=='N')) { 
	         System.out.println("Invalid input! Please try again.");}								
	   } while (!(choice=='Y'||choice=='N')); 			   
          } while(choice=='Y');			 		
       System.out.println("Thank you for visiting my program.");		
    }
}
			
			
			
			
			
		
		
		
	

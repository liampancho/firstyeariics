import java.util.Scanner;
public class finalsProblem2{    
    public static void main (String[]args) {       
        Scanner input = new Scanner(System.in);        
        int num; char answer;                
        do {        
            System.out.print("Enter a number to execute: ");        
            while(!input.hasNextInt()) {
                System.out.println("INVALID! TRY AGAIN");
                input.next();
            }
            num=input.nextInt();            
            System.out.println();
            for (int i=1;i<=num;i++) {
                for (int j=1;j<i;j++) {
                    System.out.print(" ");
                }                
                for(int k=i;k<=num;k++) {
                    System.out.print(k + " ");
                }                
                System.out.println();
            }
            for (int i=num;i>=1;i--){
                for (int j=1;j<i;j++){
                    System.out.print(" ");
                }    
                for (int k=i;k<=num;k++){
                    System.out.print(k + " ");
                }             
                System.out.println();
            }        
            do {
                System.out.print("DO YOU WANT TO CONTINUE? <Y/N>: ");
                answer=Character.toUpperCase(input.next().charAt(0));               
                if (!(answer=='Y'||answer=='N')) { 
                    System.out.println("\nInvalid input! Please try again.");
                }              
            } while (!(answer=='Y'||answer=='N'));             
        } while (answer=='Y');        
        System.out.println("\nThank you for visiting my program.");
    }
}


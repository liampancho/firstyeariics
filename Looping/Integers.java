import java.util.*;
public class Integers 
{
  public static void main(String[]args) 
  {
    int num,sumEven=0,sumOdd=0, counter=0;
    Scanner input = new Scanner(System.in);
    System.out.print("\t\t\t\tSum of Even and Odd Integers\nInput a number: ");
    num = input.nextInt();		
    do
     {			
       System.out.println(counter);			
       if(counter%2==0) {sumEven+=counter;}
       else {sumOdd+=counter;}
       counter++;
     }
    while(counter<=num); 
    System.out.println("Sum of Even Numbers: "+sumEven);
    System.out.println("Sum of Odd Numbers: "+sumOdd);
  }
}
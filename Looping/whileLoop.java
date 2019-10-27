import java.util.Scanner;
/**
 * Pancho, Jan William Serge C.
 * 1-ITH
 * ICS2602
 * October 23, 2019
 */
public class whileLoop
{
   public static void main (String[]args) throws Exception
   {
       Scanner input=new Scanner(System.in);
       int count=2, n;
       System.out.print("\t\tWelcome!!\n Please Input a number: ");
       n=input.nextInt();
       System.out.print("\nEven Numbers from 1 to "+n+" are: \n");
       while (count<=n)
       { 
         System.out.println(count);  
         count+=2;        
       }
   }
}

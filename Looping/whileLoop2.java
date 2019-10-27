import java.util.Scanner;
/**
 * Pancho, Jan William Serge C.
 * 1-ITH
 * ICS2602
 * October 23, 2019
 */
public class whileLoop2
{
   public static void main (String[]args) throws Exception
   {
       Scanner input=new Scanner(System.in);
       int count, n;
       System.out.print("\t\tWelcome!!\n Please Input your base number: ");
       count=input.nextInt();
       System.out.print("Input your desired number: ");
       n=input.nextInt();      
       System.out.print("Even Numbers from "+count+ " to "+n+" are: \n");
       while (count<=n)
       { 
         if(count%2==0)
         {
           System.out.println(count);            
         }
         count++;
       }
   }
}

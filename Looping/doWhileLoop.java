import java.util.*;
public class doWhileLoop
{
  public static void main(String[]args)
  {
      Scanner input=new Scanner(System.in);
      int count, n;
      System.out.print("\t\tWelcome!\nPlease enter your first number: ");
      count=input.nextInt();
      System.out.print("Enter the desired number n: ");
      n=input.nextInt();
      System.out.print("Even numbers from "+count+" to "+n+" are: \n");
      do{
          if(count%2==0)
          {
              System.out.println(count);             
          }
          count++;
        }
      while(count<=n);      
  }
}

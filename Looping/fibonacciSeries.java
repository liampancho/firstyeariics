import java.util.*;
public class fibonacciSeries
{
  public static void main(String[]args)
  { 
    int num, a=0, b=0, c=1;
    Scanner input=new Scanner(System.in);
    System.out.print("\t\t\t\tFibonacci Series\nEnter the number n: ");
    num=input.nextInt();
    System.out.println("Here is your Series: ");        
    for (int counter=1;counter<=num;counter++)
     {
       a=b; b=c; c=a+b;
       System.out.println(a);
     }   
  }
}

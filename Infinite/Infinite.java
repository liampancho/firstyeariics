import java.util.Scanner;
public class Infinite
{
  public static void main(String[]args) 
  {
    String answer;
    Scanner input=new Scanner(System.in); 
    System.out.println("\t\tInfinite");
    for(int count=1;count>=1;count++)
     {
       System.out.println(count);
       if (count==1000)
        {   
          System.out.print("Do you want to continue?\nYes or No? ");
          answer=input.nextLine(); 
          switch(answer)
          {
           case"Yes":
            continue;
           case"yes":
            continue;
           default: System.out.print("Thank you for wasting your time with us!"); 
          }
          break;
        }
     }
  }
}

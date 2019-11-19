import java.util.*;
public class bonus
{
   public static void main(String[]args)
   {
     Scanner input=new Scanner(System.in);
     System.out.print("How many values to input?: ");
     int num=input.nextInt();
     int[]arrayValues= new int[num];
     System.out.print("You want to input "+num+" numbers.\nEnter your values: ");
     for(int i=0;i<arrayValues.length;i++)
     {
       arrayValues[i]=input.nextInt();
     }
     System.out.print("The Values are: ");
     for(int i=0;i<arrayValues.length;i++)
     {
        System.out.print(arrayValues[i]+", ");
     }   
   }
}

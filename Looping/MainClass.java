import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args)
    {
        int zero=20,count=1;
        System.out.print("\t\t\t\t\t\t\t\tDiamond\n");
        for(int i=1;i<=2*zero-1;i++)
        {
          for(int j=count;j<=zero;j++)
          {
            System.out.print("000"); 
          }
          for(int k=1;k<=count*2-1;k++)
          {
            System.out.print(" ");  
          }
          if(i<zero)
                count++;
          else
                count--; 
                System.out.println("");
        }
    }
}
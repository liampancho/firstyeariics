import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class forLoop
{
    public static void main(String[]args) throws Exception
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int count, n;
        try
        {
            System.out.print("\t\tWelcome!\nPlease enter your first number: ");
            count=Integer.parseInt(input.readLine());
            System.out.print("Input your desired number n: ");
            n=Integer.parseInt(input.readLine());
            System.out.print("Even numbers from "+count+" to "+n+" are: \n");
            for(;count<=n;count++)
             {
                if(count%2==0)
                {
                   System.out.println(count);
                }
             }           
        }
        catch (Exception e)
        {
            System.out.print("ERROR!");
        }       
    } 
}

import java.util.Scanner;
public class statisticalResult
{
   public static void main(String[]args)
   {
     Scanner input=new Scanner(System.in);
     String text;
     System.out.print("Input any plain text: ");
     text=input.nextLine();
     char[]number=text.toCharArray();
     int letter=0,digit=0,whitespace=0,other=0;     
     for(int count=0;count<text.length();count++)
     {
        if(Character.isLetter(number[count]))
        {
          letter++;
        }
        else if(Character.isDigit(number[count]))
        {
          digit++;
        }
        else if(Character.isSpaceChar(number[count]))
        {
          whitespace++;
        }
        else
        {
          other++;
        }
     }
     int total=letter+whitespace+digit+other;  
     float letterPercent=(float)(letter*100)/total;
     float digitPercent=(float)(digit*100)/total;
     float whitespacePercent=(float)(whitespace*100)/total;
     float otherPercent=(float)(other*100)/total;
     System.out.println("\n"+text+"\n\nTotal Number of Characters in String: "+total);
     System.out.println("CATEGORY\t\t\tHOW MANY?\t\t\t% OF FILE");
     System.out.println("\nLETTERS\t\t\t\t"+letter+"\t\t\t\t"+letterPercent+"%");
     System.out.println("WHITESPACE\t\t\t"+whitespace+"\t\t\t\t"+whitespacePercent+"%");
     System.out.println("DIGITS\t\t\t\t"+digit+"\t\t\t\t"+digitPercent+"%");
     System.out.println("PUNCTUATIONS\t\t\t"+other+"\t\t\t\t"+otherPercent+"%");
     System.out.println("TOTAL\t\t\t\t\t\t\t\t100%");
   }
}

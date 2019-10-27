public class DoWhileOddNumberLoop
{
  public static void main(String[]args) 
  {
    int count=1;
    System.out.println("\tOdd Number Incrementation");
    do
     {
       System.out.println("Odd number: "+count);
       ++count;count++;            
     }
    while(count<30);
  }
}

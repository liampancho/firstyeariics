import java.util.Scanner;
public class UserInfo
{
   public static void main(String[] args) throws Exception
  {
    Scanner userInput = new Scanner(System.in);
    String name, input,inputTeleNum;
    int teleNum;
    while (true) {
        System.out.print("Enter your name: ");
        name = userInput.nextLine();
        System.out.print("Please verify your name by typing YES or NO: ");
        input = userInput.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            System.out.print("Your name is: " +name+"\n");
        } else if (input.equalsIgnoreCase("no")) {
            continue;
        } else {
            System.out.print("Error! Try again!\n");
            continue;}
        while (true) {
            System.out.print("Enter your telephone number: ");
            teleNum = userInput.nextInt();
            System.out.print("Please verify your telephone number by typing YES or NO: ");
            inputTeleNum = userInput.next();
            if (inputTeleNum.equalsIgnoreCase("yes")) {
                System.out.print("Your telephone num is: " + teleNum);
                System.exit(0);
            } else if (inputTeleNum.equalsIgnoreCase("no")) {
                continue;
            } else {
                System.out.print("Error! Try again!\n");
                continue;} 
        }
    }
  }
}

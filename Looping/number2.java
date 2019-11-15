import java.util.Scanner;

public class number2 {
	
	public static void main(String[]args) {
		
		String name;
		int answer;

		do {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter a name: ");
		name = input.nextLine();
		
		System.out.println("Do you want to continue?: \n[1] YES [0] NO");
		answer = input.nextInt();
		
		if (answer==0) {
			System.out.println("Thank you come again!");
		}
		
		}while(answer==1);
	}
}

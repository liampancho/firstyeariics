import java.util.Scanner;

public class number5 {
	
	public static void main(String[]args) {
		
		int number,x,numberTotal=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a stop value: ");
		x = input.nextInt();
		
		do {
		System.out.print("Input a number: ");
		number = input.nextInt();
		numberTotal+=number;
		
		}while(number!=x);
		
		System.out.println("Total: "+numberTotal);
		
		
	}
}






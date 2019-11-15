import java.util.Scanner;

public class number6 {
	
	public static void main(String[]args) {
		
		int x,y,operation,answer=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two values: ");
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.println("\n[1]Add [2]Subtract [3]Multiply [4]Divide ");
		operation = input.nextInt();
		
		switch(operation) {
		case 1:
			answer = x+y;
			break;
		
		case 2:
			answer = x-y;
			break;
			
		case 3:
			answer = x*y;
			break;
			
		case 4:
			answer = x/y;
			break;
		}
		
		System.out.println("Answer is: "+answer);
		
	}

}

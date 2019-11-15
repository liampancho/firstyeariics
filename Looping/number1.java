import java.util.Scanner;

public class number1 {
	public static void main(String[]args) {
		
		int number,i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		i=1;
		 do{
		    	
		    System.out.println(number + " x " + i + " = " + (number*i));
		    i++;	
		  }
		while(i<=10);
		
		
	}

}

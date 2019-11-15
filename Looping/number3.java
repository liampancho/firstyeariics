import java.util.Scanner;
public class number3 {
	public static void main(String[]args) {
		
		int n,sumEven = 0,sumOdd = 0,i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		n = input.nextInt();
		
		for (i = 0; i<=n; i++) {
			
			System.out.println(i);
			
			if(i%2==0) {
				sumEven+=i;
			}
			else {
				sumOdd+=i;
			}
			
		}
		
		System.out.println("Even sum: "+sumEven);
		System.out.println("Odd sum: "+sumOdd);
		
	}

}

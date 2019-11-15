import java.util.Scanner;

public class number4{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int i,quizzesNumber,mpNumber,petaNumber;
        int quizzes=0,mp=0,peta=0;
        int quizTotal=0,mpTotal=0,petaTotal=0;
        System.out.print("Enter number of Quizzes: ");
        quizzesNumber = input.nextInt();
        
        System.out.println("Enter score of Quizzes ");
        for(i=1;i<=quizzesNumber;i++){
        	System.out.print("Quiz "+i+": ");
            quizzes = input.nextInt();
            quizTotal+=quizzes;
        }
        
        System.out.println("Quiz Average: " +quizTotal/quizzesNumber);
        
        System.out.print("\nEnter number of PeTa: ");
        petaNumber = input.nextInt();
        
        System.out.println("Enter scores of PeTa ");
        for(i=1;i<=petaNumber;i++){
        	System.out.print("PeTa "+i+": ");
            peta = input.nextInt();
            petaTotal+=peta;
        }
                System.out.println("Quiz Average: " +petaTotal/petaNumber);
        
        System.out.print("\nEnter number of Machine Problems: ");
        mpNumber = input.nextInt();
        
        System.out.println("Enter score of Machine Problems ");
        for(i=1;i<=mpNumber;i++){
        	System.out.print("Machine Problem "+i+": ");
            mp = input.nextInt();
            mpTotal+=mp;
        }
        System.out.println("Machine Problem Average = " +mpTotal/mpNumber);
      
    }
}



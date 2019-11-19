// 3. Write a program that will sum the values of an array.

public class number3{
    
    public static void main (String[]args){
        
        int sum=0;
        
        int [] arrayValue = {5,10,15,20};
        
        for (int i = 0; i < arrayValue.length; i++){
            
            System.out.print(arrayValue[i] + " " );
            sum += arrayValue[i];
        }
        
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
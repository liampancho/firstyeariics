// 2. Write a program that will display the reverse order a given set of array values.

public class number2 {
    
    public static void main (String[] args){
        
        int [] arrayValue = {1,2,3,4,5};
        
        System.out.print("Original Values: " );
        
        for (int i = 0; i < arrayValue.length; i++){
            
            System.out.print(arrayValue[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Reversed Values: " );
        
        for (int i = arrayValue.length-1; i>= 0; i--){
            
            System.out.print(arrayValue[i] + " ");
        }
    }
}
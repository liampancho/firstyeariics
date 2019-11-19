//1. Write a program that will display the table of an array index and its corresponding value. Use for loop.

public class number1{
    
    public static void main (String[]args){
        
        int [] arrayValues = {10,20,30,40};
        
        System.out.println("Index" + "\tValue");
        
        for (int i = 0; i< arrayValues.length; i++){
            
            System.out.println(i + "\t" + arrayValues[i]);
        }
    }
}
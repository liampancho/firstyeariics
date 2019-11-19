//4. Write a program that will calculate the average value of the arrays. Use for loop.


public class number4{
    
    public static void main (String[]args){
        
        int sum = 0;
        
        int [] arrayValue = {1,2,3,4,5,6};
        
        for (int i = 0; i < arrayValue.length; i++){
            
            System.out.print(arrayValue[i] + " " );
            sum += arrayValue[i];
        }
        int average=sum/arrayValue.length;
        System.out.println();
        
        System.out.println("Average: "+average);
    }
}

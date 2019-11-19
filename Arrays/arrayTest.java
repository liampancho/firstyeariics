public class arrayTest{
    
    public static void main (String[]args){
        
        /**    array syntax method 1
         *     
         *     variableType[] arrayName = new variableType [length of array];
         *     
         *     arrayName[0] = value of array 0;
         *     arrayName[1] = value of array 1;
         *     arrayName[2] = value of array 2;
         *     arrayName[n] = value of array n;
         *     
         *     OR
         *     
         *     array syntax method 2
         *     
         *     variableType[] arrayName = {value0,value1,value2,valueN};
         * 
         */
        
        //method 1
        int [] arrayType1 = new int[3];
        
        arrayType1[0] = 5;
        arrayType1[1] = 10;
        arrayType1[2] = 15;
        
        //up to index [2] only because counting starts from 0, therefore there are 3 values for arrayType1;
        
        System.out.println(arrayType1[0] + " + " + arrayType1[1] + " + " + arrayType1[2] + " = " + (arrayType1[0] + arrayType1[1] + arrayType1[2]));
        
        //method 2
        
        int [] arrayType2 = {5,10,15};
        
        //up to index [2] only because counting starts from 0, therefore there are 3 values for arrayType1;
        
        System.out.println(arrayType2[0] + " + " + arrayType2[1] + " + " + arrayType2[2] + " = " + (arrayType2[0] + arrayType2[1] + arrayType2[2]));
        
    }
}
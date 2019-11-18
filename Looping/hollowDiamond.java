public class hollowDiamond
{
   public static void main(String[]args)
   {
     int num=33;
     for(int x=1;x<=num;x++)
     {
       for(int y=1;y<=(num*2);y++)
       {
         if(x>(num-y+1)){System.out.print(" ");}
         else{System.out.print("0");}   
         
         if ((x+num)>y){System.out.print(" ");}
         else{System.out.print("0");}
       }
       System.out.println();
     }
     
     for(int x=1;x<=num;x++)
     {
       for(int y=1;y<=(num*2);y++)
       {
         if(x<y){System.out.print(" ");}
         else{System.out.print("0");}   
         
         if (x<=((num*2)-y)){System.out.print(" ");}
         else{System.out.print("0");}
       }
       System.out.println();
     }
   }
}

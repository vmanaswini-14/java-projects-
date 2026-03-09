import java.util.*;
import java.lang.*;
public class NumberGuessingGame
{
     public static void main(String args[])
     {
          int count = 0;
          int maxattempts = 3;
          
        int rannum = (int) (Math.random() * 501 );
        System.out.println("Enter the number you guess between 0 to 500 \n");
        System.out.println("you have only 3 chances so think ");

     

        while(count<maxattempts)
        {
          Scanner sc=new Scanner ( System.in);
        int no;
        no=sc.nextInt();
        count ++;

        if(no==rannum)

        {
          System.out.println("you guessed it correctly you won !!!");
          break;
        }
        else if(no>rannum)
        {
           System.out.println("larger number so guess smaller number than this ");
        }
        else
        {
           System.out.println("smaller number so guess larger number than this ");
        }
        
          System.out.println("wrong guess your have only "+ (maxattempts-count)+"chances left ");
          
        

          }
     
     }
    
}
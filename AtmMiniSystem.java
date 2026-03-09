import java.util.*;
public class AtmMiniSystem
{
    public static void main(String args[])
{
    int security_pin=140807;
    int balance=100000;
    int pin,count=0;
    while(count>3)
    {
    System.out.println("Enter your pin =");
    Scanner sc=new Scanner(System.in);
    pin=sc.nextInt();


    if(pin==security_pin)
    {
     System.out.println("correct pin you can proceed !!!");
    
      
    int n=1,ch;
    while (n>0)
    {
    System.out.println("ATM OPERATIONS ");
    System.out.println("1.check balance\n2.deposit\n3.withdraw\n4.exit");
    System.out.println("enter your choice : ");
    n=sc.nextInt();

    switch(n)
    {
        case 1:
            System.out.println("remaining balance = "+balance);
            break;
        case 2:
            int amo;
             System.out.println("enter ammount to deposit ");
             amo=sc.nextInt();
             if(amo>0)
             {
                balance=balance+amo;
                 System.out.println("amount deposited!!");
                  System.out.println("balance = "+balance);
                
             }
             else
             {
                 System.out.println("enter correct amount");
                 

             }
             break;
        case 3:
            int draw;
             System.out.println("enter amount to withdraw : ");
             draw=sc.nextInt();

             if(draw<=balance)
             {
                balance=balance-draw;
                System.out.println("balance = "+balance);
                System.out.println("withdraw succesfull!!!");


             }
             else
             {
                System.out.println("insufficient balance ");

             }
             break;
        case 4:
            System.out.println("exisiting program ");
            n=0;
            break;

            default:
                System.out.println("wrong choice!!!");

    }
   


    }
    }
    else
{ 
        System.out.println("wrong pin recheck ");
        count = count+1;
        
    }
    }
    
}


}
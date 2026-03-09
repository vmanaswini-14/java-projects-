import java.util.*;
import java.lang.*;
public class BankingManagmentSystem
{
public static void main(String args[])
{
    
    int ch=1,inibal=0;
    Scanner sc=new Scanner(System.in);
    String name,gender,address,email,aadhaar,mobile;
        int age,pin;
        System.out.println("to create account following details are requried so enter correctly ");
    System.out.println("enter your name : ");
    name=sc.nextLine();
    System.out.println("enter your gender (M/F) : ");
    gender=sc.nextLine();
    System.out.println("enter your address : ");
    address=sc.nextLine();
    System.out.println("enter your email : ");
    email=sc.nextLine();
    System.out.println("enter your age : ");
    age=sc.nextInt();
    System.out.println("enter your mobile (10 digits) : ");
    mobile=sc.next();
    System.out.println("enter your aadhaar : ");
    aadhaar=sc.nextLine();
    System.out.println("enter amount you want to store (min=1000 rs )\n : ");
    inibal=sc.nextInt();
    System.out.println("enter a security pin");
    pin=sc.nextInt();

    if(inibal>=1000)
    {
     System.out.println("your account succesfully created !!!");
    }
    else
    {
        System.out.println("not sufficient initial balance check\n");
        ch=0;
    }
    if(age<18)
    {
        System.out.println("check age ");
        ch=0;
    }
    if(mobile.length()!=10)
    {
        System.out.println("enter correct phone number ");
    }

    
    while (ch>0)
    {

        
    long accno = (long)(Math.random() * 1000000000L);
    System.out.println("Account number = "+accno+"\n");
        System.out.println("1.Deposit \n 2.Withdraw \n 3.AccountDetails\n  4.ChangePin \n 5.exit");
        System.out.println("ENTER YOUR CHOICE : \n");
        ch=sc.nextInt();
        switch(ch)
        {
    
     case 1:
        int am,spin;
        System.out.println("enter your security pin = \n");
        spin=sc.nextInt();
        if(spin==pin)
        {
         System.out.println("enter amount to deposit \n");
         am=sc.nextInt();
         if(am>0)
         {
        inibal = inibal+am;
         System.out.println("DEPOSIT SUCCESFULL !!!");
        System.out.println("Amount in your account = "+inibal);
         }
         else

         {
            System.out.println("enter amount correctly \n");

         }
        }
        else
        {
            System.out.println("wrong pin check !!!\n");
        }
        break;

     case 2:
        int amo,spin1;
        System.out.println("enter your security pin = \n");
        spin1=sc.nextInt();
        if(spin1==pin)
        {
        System.out.println("enter amount to withdraw \n");
         amo=sc.nextInt();
         if(amo<=inibal)
         {
        inibal = inibal-amo;
        System.out.println("WITHDRAW SUCCESFULL !!!");
        System.out.println("Amount in your account = "+inibal);
         }
         else
         {
             System.out.println("Insufficient Balance \n");
         }
        }
        else
        {
            System.out.println("wrong pin check !!!\n");
        }
        break;

     case 3:
        
    System.out.println("==== Account Details ====");
    System.out.println("Name       : " + name);
    System.out.println("Gender     : " + gender);
    System.out.println("Age        : " + age);
    System.out.println("Address    : " + address);
    System.out.println("Email      : " + email);
    System.out.println("Mobile     : " + mobile);
    System.out.println("Aadhaar    : " + aadhaar);
    System.out.println("Account No.: " + accno);
    System.out.println("Balance    : " + inibal);
    System.out.println("========================");
    break;

     case 4:
        int cpin,spin2;
        System.out.println("enter your security pin = \n");
        spin2=sc.nextInt();
        if(spin2==pin)
        {
             System.out.println("enter a security pin");
    cpin=sc.nextInt();
    if(pin==cpin)
    {
         System.out.println("enter a different pin ");
    }
    else
    {
        pin=cpin;
         System.out.println("pin succesfully changed !!!\n");
    }
        }
        else
        {
            System.out.println("wrong pin entered check ");
        }
    break ;

     case 5:
         System.out.println("Exiting");
         ch=0;

        }
    }
}
}
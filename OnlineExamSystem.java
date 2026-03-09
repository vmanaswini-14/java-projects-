import java.util.*;
public class OnlineExamSystem
{
    
    public static void main(String args[])
{
  int count = 0;
    String[] questions = {"1.what is the captal of india ?","2.what is the symbol of comment in C ?","3.1+1?","4.435-35?","5.colour of sky?"};
    String[][] options = {{"a.delhi","b.chennai","c.mumbai","d.banglore"},{"a.//n","b./","c.//","d./?"},{"a.1","b.4","c.2","d.5"},{"a.34","b.44","c.35","d.44"},{"a.blue","b.red","c.green","d.pink"}};
    String[] answers = {"a","c","c","c","a"};
Scanner sc=new Scanner(System.in);
    for(int i=0;i<questions.length;i++)
    {
    System.out.println("\n"+questions[i]);
    for(int j=0;j<options[i].length;j++)
    {
      System.out.println(options[i][j]);
    }
    System.out.println("Enter your answer (a/b/c/d)");
    String ans=sc.next();

    if(ans.equalsIgnoreCase(answers[i]))
    {
      count++;
    }
    }
  
      System.out.println("total score = "+ count);

    if(count > 2)
    {
      System.out.println("PASS!!");
    }
    else
    {
      System.out.println("Fail!!");
    }
   
}
}
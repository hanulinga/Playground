import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int key=sc.nextInt();
      if(ch>='a'&&ch<='z')
      {
       // int offset=ch-'a';
        //int sum=(offset+key)%26;
       int sum=ch-key;
        ch=(char)sum;
        if(ch<97)
          System.out.println("z");
        else
        System.out.println(ch);
      }
      if(ch>='A'&&ch<='Z')
      {
         int sum=ch-key;
        ch=(char)sum;
        System.out.println(ch);
      }
        
    }
}
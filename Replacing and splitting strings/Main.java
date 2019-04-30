import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int parts=sc.nextInt();
      StringBuilder sb=new StringBuilder(str2);
      int len=sb.length();
      for(int i=0;i<len;i++)
      {
        if(sb.charAt(i)==' ')
          System.out.println();
        else
          System.out.print(sb.charAt(i));
    }
      
      
    }
}
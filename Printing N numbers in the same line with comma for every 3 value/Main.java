import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //int m=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      if((i%3==0)&&(i!=n))
      {
        System.out.print(i);
          System.out.print(",");
      }
        else
        {
          System.out.print(i);
        }
    }
  }
}
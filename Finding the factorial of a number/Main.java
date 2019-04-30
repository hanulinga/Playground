import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //fact(n);
    System.out.println(fact(n));
  }
  public static int fact(int n)
  {
    int f=0;
    if(n==0)
    {
      return 1;
    }
    if(n>0)
    {
      f=n*fact(n-1);
    }
    return f;
  }
}
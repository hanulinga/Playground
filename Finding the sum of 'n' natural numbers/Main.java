import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum_n(n));
    }
     public static int sum_n(int n)
                         {
                           int s=0;
                           if(n==0)
                           {
                             return 0;
                           }
                           else
                           {
                             s=n+sum_n(n-1);
                           }
                           return s;
                         }
                             
                             
}
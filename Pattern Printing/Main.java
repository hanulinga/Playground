import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int coloumn=sc.nextInt();
      for(int a=row;a>=1;a--)
        {
            for(int b=coloumn;b>=1;b--)
            {
                if(a>=b)
                {
                    System.out.print(a);
                }
                else
                {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}
      
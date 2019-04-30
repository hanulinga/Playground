import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int val=1;
      for(int i=1;i<=n;i++)
          {
            for(int s=1;s<=(n-i);s++)
            {
              System.out.print(" ");
            }
        for(int j=1;j<=i;j++)
            {
              
            System.out.printf("%d ",val++);
            }
            System.out.print("\n");
          }
    }    
}
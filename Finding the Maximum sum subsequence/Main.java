import java.util.Scanner;
class Main
{
   public static int Sub_sequent(int arr[],int n)
  {
    int running_sum=arr[0];
    int max_sub_sum=arr[0];
    for(int i=1;i<=n;i++)
    {
      if(arr[i]>arr[i-1])
      {
        running_sum+=arr[i];
      }
      else
      {
        running_sum=arr[i];
      }
      if(running_sum>max_sub_sum)
      {
        max_sub_sum=running_sum;
      }
    }
    return max_sub_sum;
  }

  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[20];
    for(int i=1;i<=n;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println(Sub_sequent(arr,n));
  }
}
    
  
 

import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int sum=0,sum1=0;
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      sum=size*(size+1)/2;
      for(int i=0;i<size;i++)
      {
        for(int j=0;j<size;j++)
        {
          if((i!=j)&&(arr[i]==arr[j]))
             {
               arr[j]=0;
               break;
             }
             }
             }
             for(int i=0;i<size;i++)
             {
               sum1=sum1+arr[i];
             }
             int missed_val=sum-sum1;
             System.out.println(missed_val);
             
             
      
    }
}
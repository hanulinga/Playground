import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int greatest=arr[0];
      for(int i=0;i<=n-1;i++)
      {
        if(arr[i]>greatest)
          greatest=arr[i];
      }
      System.out.println(greatest);
    }
}
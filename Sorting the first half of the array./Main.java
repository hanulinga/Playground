import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    insertion_sort(n,arr);
  }
  public static void insertion_sort(int n,int arr[])
  {
    for(int i=1;i<n/2;i++)
    {
      int key=arr[i];
      int idx=i-1;
      while((idx>=0)&&(arr[idx]>key))
            {
              arr[idx+1]=arr[idx];
              idx--;
            }
            arr[idx+1]=key;
            }
            for(int i=0;i<n;i++)
            {
              System.out.print(arr[i]+" ");
            }
            
      
    
  }
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    for(int j=r-1;j>=0;j--)
    {
      for(int i=0;i<c;i++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
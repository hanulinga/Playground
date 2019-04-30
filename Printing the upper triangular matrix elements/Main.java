import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int i,j,k;
    int arr[][]=new int [r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    for(k=0;k<c;k++)
    {
      for(i=0,j=k;j<c;j++,i++)
      {
        System.out.print(arr[i][j]+" ");
      }
     // System.out.println();
    }
    
  }
}
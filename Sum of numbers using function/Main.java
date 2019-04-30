import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int s=num*(num+1)/2;
    return s;
  }
    
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int su=sum(n);
      System.out.println(su);
	}
}
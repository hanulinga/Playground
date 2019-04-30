import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int s2=num*num;
    return s2;
  }
    
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int area=square(n);
      System.out.println(area);
      
	} 
}
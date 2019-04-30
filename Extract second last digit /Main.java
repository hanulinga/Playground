import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int rem=n%100;
      int rem1=rem/10;
      System.out.println(rem1);
	}
}
import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last_digit=n%10;
      int first_digit=n/100;
      System.out.println(last_digit+first_digit);
	}
}
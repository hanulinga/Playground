import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int first_digit=n%10;
      int second_digit=n/10;
      System.out.println(first_digit+second_digit);
	}
}
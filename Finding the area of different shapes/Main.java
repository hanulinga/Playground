import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int choice=sc.nextInt();
      int area;
      switch(choice)
      {
        case 1:
          int side=sc.nextInt();
          area=side*side;
          System.out.println(area);
          break;
        case 2:
          int breadth=sc.nextInt();
          int length=sc.nextInt();
          area=length*breadth;
          System.out.println(area);
          break;
        case 3:
          double base=sc.nextInt();
          double height=sc.nextInt();
          double area2;
          area2=0.5*base*height;
          System.out.println(area2);
          break;
        case 4:
         double radius=sc.nextInt();
          double area1;
          area1=3.14*radius*radius;
          System.out.println(area1);
          break;
        default:
          System.out.println("invalid input");
      }
    }
}
          
          
        
 
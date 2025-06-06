import java.util.*;
class Swapping
{ 
  public static void main(String args[])
  {
     int temp;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a value:");
     int a=sc.nextInt();
     System.out.println("enter b value:");
     int b=sc.nextInt();
     System.out.println("before swapping:"+ a +" " +b);
     temp=a;
     a=b;
     b=temp;
     System.out.println("after swapping:"+ a +" " +b);
  }
}
     
     
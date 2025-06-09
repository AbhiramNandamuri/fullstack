import java.util.*;
public class Count
{
   static int countZero(String s)
  {
    int sum=0,N=0;
    int n=s.length();
    for(int i=n-1;i>=0;i--)
    {
       if(s.charAt(i)=='1')
       {
         sum=sum+N;
       }
       else
       {
         N=N+1;
       }
    }
    return sum;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int result=countZero(s);
    System.out.println(result);
  }
}
       
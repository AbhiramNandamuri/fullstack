import java.util.*;
class Prime
{
  public static void main(String args[])
  {
    
    Scanner sc =new Scanner(System.in);
    int c=0;
    int n= sc.nextInt();
    for(int i=2;i<n-1;i++)
    {
      if(n%i==0)
      {
         c++;
          break;
      }
    }
      if(c==2)
      {
         System.out.println("prime");
      }
      else
      {
         System.out.println("not prime");

      }
   }
} 
import java.util.*;

public class Alphabets {
    public static boolean allAlpha(String str) 
    {
        HashSet<Character> hs = new HashSet<>();    
        for(int i=0;i<str.length();i++)
        {
            char ch=Character.toLowerCase(str.charAt(i));
            hs.add(ch);
        }
        if(hs.size()==26)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        boolean result=allAlpha(str);
        System.out.println(result);
    }
}

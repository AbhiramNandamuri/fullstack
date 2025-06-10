import java.util.*;
public class RemoveDuplicates 
{
    public static void main(String[] args)
   {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> result = new ArrayList<>();
        for (String item : list) 
        {
            if (!result.contains(item)) 
            {
                result.add(item);
            }
        }
        System.out.println(result);
   }
}
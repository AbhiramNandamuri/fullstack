import java.util.*;
public class DynamicIntegerList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();
        System.out.println("Enter integers one by one (Enter 0 to stop):");
        while (true)
        {
            int num = sc.nextInt();
            if (num == 0) 
            {
                break;
            }

            intList.add(num);
        }
        Collections.sort(intList,Collections.reverseOrder());
        System.out.println("Sorted list: " + intList);
        if (intList.size() > 1)
        {
            System.out.println("Second smallest number: " + intList.get(1));
        } 
        else
        {
            System.out.println("Not enough elements to print the second element.");
        }
   }
 
}
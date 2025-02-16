import java.util.HashMap;

public class findMajorityElement {
    public static void find(int arr[])
    {
        int ans = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int n : arr)
        {
            if(!map.containsKey(n))
            {
                map.put(n, 1);
            }
            else
            {
                map.put(n, map.get(n) + 1);
            }
        }
        for(int n : map.keySet())
        {
            if(map.get(n) > arr.length/2)
            {
                System.out.println("Majority element "+n);
                ans++;
            }
        }
        if(ans == 0)
        {
            System.out.println("In this array there is no majority element is present");
        }
    }
    public static void main(String args[])
    {
        int arr[] = new int[]{3};
        find(arr);
    }
}

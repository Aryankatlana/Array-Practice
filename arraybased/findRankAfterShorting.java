import java.util.Arrays;
public class findRankAfterShorting {
    public static void arrange(int arr[])
    {
        int shortArr[] = Arrays.copyOf(arr , arr.length);
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i ; j < arr.length ; j++)
            {
                if(shortArr[i] > shortArr[j])
                {
                    int temp = shortArr[i];
                    shortArr[i] = shortArr[j];
                    shortArr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length ; j++)
            {
                if(arr[i] == shortArr[j])
                {
                    System.out.println(arr[i]+"  " +(j+1));
                }
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = new int[]{20,15,25,2,98,6};
        arrange(arr);

    }
}

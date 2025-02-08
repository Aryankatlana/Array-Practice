import java.util.*;
public class findMedian {
    public static void findMiddleELement(int arr1[] , int arr2[])
    {
        int newArr[] = new int[arr1.length+ arr2.length];
        int median;
        int p = arr1.length;
        for(int i = 0 ; i< arr1.length ; i++)
        {
            newArr[i] = arr1[i];
        }
        for(int i = 0 ; i< arr2.length ; i++)
        {
            newArr[p] = arr2[i];
            p++;
        }
        for(int n = 0 ; n < (newArr.length -1) ; n++)
        {
            for(int j = n ; j < newArr.length ; j++)
            if(newArr[n] > newArr[j])
            {
                int temp = newArr[n];
                newArr[n] = newArr[j];
                newArr[j] = temp;
            }
        }
        int middle = newArr.length/2;
        
        if(((newArr.length-1) % 2) == 0)
        {
             median = newArr[middle];
        }
        else
        {
             median = (newArr[middle-1] + newArr[middle])/2;
        }
        System.out.println("Median of Two Array is "+median);

    }
    public static void main(String args[])
    {
        int arr1[] = new int[]{1,12,15,26,38,39};
        int arr2[] = new int[]{2,13,17,30,45,46};
        findMiddleELement(arr1, arr2);

    }
}

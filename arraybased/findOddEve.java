public class findOddEve {
    public static void find(int arr[])
    {
        int oddArr[] = new int[arr.length];
        int eveArr[] = new int[arr.length];
        int k = 0, j = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] % 2 == 0)
            {
                eveArr[k] = arr[i];
                k++;
            }
            else
            {
                oddArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Odd element of Array");
        for(int p = 0 ; p < j ; p++)
        {
            System.out.println(oddArr[p]);
        }
        System.out.println("Even elements of Array");
        for(int p = 0 ; p < k ; p++)
        {
            System.out.println(eveArr[p]);
        }

    }
    public static void main(String args[])
    {
        int arr[] = new int[]{18,3,12,1,16,6};
        find(arr);

    }
}

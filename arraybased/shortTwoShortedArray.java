public class shortTwoShortedArray {
    public static void margeToArray(int arr1[] , int arr2[])
    {
        for(int i = 0 ; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr2.length ; j++)
            {
                if(arr1[i] < arr2[j])
                {                 
                    break;
                }
                else
                {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;

                    for(int n = 0 ; n < (arr2.length-1) ; n++)
                    {
                        if(arr2[n] > arr2[n+1])
                        {
                            int swap = arr2[n];
                            arr2[n] = arr2[n+1];
                            arr2[n+1] = swap;
                        }
                    }
                    break;
                }
            }
        }
        for(int diaplay : arr1)
        {
            System.out.print(diaplay+" ");
        }
        System.out.println();
        for(int dis : arr2)
        {
            System.out.print(dis+" ");
        }
    }
    public static void main(String args[])
    {
        int arr1[] = new int[]{1,4,6,7,8,10};
        int arr2[] = new int[]{2,3,5,9};
        margeToArray(arr1, arr2);

    }
}

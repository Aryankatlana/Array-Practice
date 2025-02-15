public class ChocolateDistributionProblem {
    public static void minDifference(int arr[] , int m)
    {
        int max , min , difference;
        int ans = arr.length;
        for(int i = 0 ; i <= (arr.length - m) ; i ++)
        {
            min = arr[i];
            max = arr[(i+m) - 1];
            difference = max - min;
            if(ans > difference)
             ans = difference ;
        }
        System.out.println("Minimum difference is "+ ans);
    }
    public static int[] sortArr(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i ; j < arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        int arr[] = new int[]{7,3,2,4,9,12,56};
        int student = 5;
        sortArr(arr);
        minDifference(arr, student);

    }
}

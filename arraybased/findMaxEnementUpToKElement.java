public class findMaxEnementUpToKElement {
    public static void findMax(int arr[] , int upto)
    {
        int maxArr[] = new int[arr.length - (upto-1)];
        int k = 0;
        for(int i = 0 ; i <= (arr.length-upto) ; i++)
        {
            int max = arr[i] ;
            for(int j = i ; j < i+upto ; j++)
            {
                if(max < arr[j])
                {
                    max = arr[j];
                }
            }
            maxArr[k] = max;
            k++;
        }
        for(int n : maxArr)
        {
            System.out.println(n+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = new int[]{2,4,7,1,6,3,4,12,16};
        int upto = 7;
        findMax(arr, upto);

    }
}

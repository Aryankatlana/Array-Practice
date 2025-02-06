public class MoveAllNegativeIntoLast {
    public static void moveToEnd(int arr[])
    {
        int newArr[] = new int[arr.length];
        int j = 0 ;
        int k = arr.length-1;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] >= 0)
            {
                newArr[j] = arr[i];
                j++;
            }
            else
            {
                newArr[k] = arr[i];
                k--;
            }
        }
        System.out.println("Arranged Array is");
        for(int n : newArr)
        {
            System.out.print(n+ " ");
        }

    }
    public static void main(String args[])
    {
        int arr[] = new int[]{1,-11,-3,0,2,5,-6,-10,-5,5};
        moveToEnd(arr);

    }
}

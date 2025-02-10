public class findSubArrayUptoTargerElement {
    public static void subArr(int arr[] , int target)
    {
        int found = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            int Subarr[] = new int[arr.length];
            int index = 0;
            int sum = 0;
            for(int j = i ; j < arr.length ; j++)
            {
                if(sum == target )
                {
                    found++;
                    System.out.print("Subarray "+found+" :");
                    for(int n = 0 ; n < index ; n++)
                    {
                        System.out.print(" "+Subarr[n]+" ");
                    }
                    System.out.println();
                    break;
                }
                else if(sum < target)
                {
                    sum += arr[j];
                    Subarr[index] = arr[j];
                    index++;
                } 
            }
        }
        if(found == 0)
        System.out.println("Not found any SubArray that's Sum is equal to the array");
        else
        System.out.println("There is "+found+" Subarray");
    }
    public static void main(String args[])
    {
        int arr[] = new int[]{3,4,-7,1,3,3,1,-4};
        int target = 7;
        subArr(arr, target);
    }
}

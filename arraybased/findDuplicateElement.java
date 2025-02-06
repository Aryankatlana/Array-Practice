public class findDuplicateElement {
    public static void returnDuplicate(int arr[])
    {
        
        System.out.println("The Duplicate Elements are");
        for(int i = 0 ; i < arr.length ; i++)
        {
            int count = 0;
            int yes = 0;
            for(int j = i ; j < arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            for(int k = 0 ; k < i ; k++)
            {
                if(arr[i] == arr[k])
                {
                    yes++;
                }
            }
            if(count>1 && yes == 0)
            {
                System.out.println(arr[i]+" "+count);
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = new int[]{18,2,2,3,18,1,2,1,1,1,2,3,1,18,1};
        returnDuplicate(arr);

    }

}

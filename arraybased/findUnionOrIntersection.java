public class  findUnionOrIntersection {
    public static void UnionOrIntersection(int arr1[] , int arr2[])
    {
        int unionArr[] = new int[arr1.length];
        int intersectionArr[] = new int[arr1.length+arr2.length];
        for(int n = 0 ; n < arr2.length ; n++)
        {
            intersectionArr[n] = arr2[n];
        }
        int p = 0;
        int k = arr2.length;
        for(int i = 0 ; i<arr1.length ; i++)
        {
            for(int j = 0 ; j<arr2.length ; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    unionArr[p] = arr1[i];
                    p++;
                    break;
                }
                else if(arr1[i]!=arr2[j] && j == (arr2.length-1))
                {
                    intersectionArr[k] = arr1[i];
                    k++;
                }
            }
        }
        System.out.println("Union of both Array :");
        for(int item = 0 ; item < p ; item++)
        {
            System.out.print(unionArr[item]+" ");
        }
        System.out.println();
        System.out.println("Intersection of both Array");
        for(int num = 0 ; num < k ; num++)
        {
            System.out.print(intersectionArr[num]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr1[] = new int[]{1,4,7,9,10};
        int arr2[] = new int[]{4,5,6,7,8,9,10};
        UnionOrIntersection(arr1 , arr2);

    }
}

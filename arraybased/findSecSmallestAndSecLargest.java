import java.util.Scanner;

public class findSecSmallestAndSecLargest {
    void secSmallest(int arr[])
    {
        int small = arr[0];
        int larg = arr[0];
        int secSmall = -1;
        int seclarg = -1;

        for(int n : arr)
        {
            if(small > n)
            {
                secSmall = small;
                small = n;
            }
            else if(small < n &&(n < secSmall || secSmall == -1))
            {
                secSmall = n;
            }
        }
        for(int n : arr)
        {
            if(larg < n)
            {
                seclarg = larg;
                larg = n;
            }
            else if(larg > n &&(n > seclarg || n ==-1))
            {
                seclarg = n;
            }
        }
        System.out.println();
        System.out.println("Second Smallest element in array is "+secSmall);
        System.out.println("Second largest element in array is "+seclarg);
    }
    public static void main(String args[])
    {
        int element ;
        System.out.println("How many element you want to insert");
        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();

        int arr[] = new int[element];
        System.out.println("Ensert the element into array");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        findSecSmallestAndSecLargest SecondEle = new findSecSmallestAndSecLargest();
        SecondEle.secSmallest(arr);

    }
}

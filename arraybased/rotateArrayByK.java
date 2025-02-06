import java.util.Scanner;

public class rotateArrayByK {
    void rotate(int arr[] , int k)
    {
        int temp ;
        int length = arr.length-1;
        for(int i = 0 ; i < k ; i++)
        {
            temp = arr[0];
            for(int j = 0 ; j<length ; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[length] = temp;
        }
        System.out.println("The rotate array is");
        for(int n : arr)
        {
            System.out.println(n);
        }
    }
    public static void main (String args[])
    {
        int elements ;
        System.out.println("Enter the number of element you want to insert");
        Scanner sc = new Scanner(System.in);
        elements = sc.nextInt();
        int arr[] = new int[elements];

        System.out.println("Enter the elements into array");
        for(int num = 0 ; num <arr.length ; num++)
        {
            arr[num] = sc.nextInt();
        }

        System.out.println("Enter the number you want to rotate");
        int k = sc.nextInt();

        rotateArrayByK ans = new rotateArrayByK();
        ans.rotate(arr , k);
    }
}

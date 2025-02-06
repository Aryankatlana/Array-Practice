import java.util.Scanner;

public class findSmallestElement {
    void smallestElement(int arr[])
    {
        int small = arr[0];
        int count = 0;
        for(int n : arr)
        {
            if(small>n)
            {
                small = n;
            }
        }
        System.out.println();
        System.out.println("Smallest element in array is "+small);

    }
    public static void main(String []args)
    {
        int element;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements you want to insert");
        element = sc.nextInt();
        int arr[] = new int[element];

        System.out.println("Enter the elements");
        for(int i = 0 ; i<element ;i++)
        {
            arr[i] = sc.nextInt();
        }
        findSmallestElement smallest = new findSmallestElement();
        smallest.smallestElement(arr);

    }
}

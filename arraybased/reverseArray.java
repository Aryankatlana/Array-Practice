import java.util.Scanner;

public class reverseArray {

    void rev(int arr[])
    {
        int temp ;
        for(int n = 0 ; n < arr.length/2 ; n++)
        {
            temp = arr[n];
            arr[n] = arr[arr.length-(n+1)];
            arr[arr.length-(n+1)] = temp;
        }
        System.out.println("The reverse array is");
        for(int n : arr)
        {
            System.out.println(n);
        }

    }
    public static void main(String args[])
    {
        int element ;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter");
        element = sc.nextInt();

        int arr[] = new int[element];
        System.out.println("Enter the element into array");
        for(int i = 0 ; i <arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        //System.out.println(arr.length);
        reverseArray ans = new reverseArray();
        ans.rev(arr);
    }
}

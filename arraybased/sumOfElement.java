import java.util.Scanner;

public class sumOfElement {

    void sumOfArray(int arr[])
    {
        int total = 0;
        for(int n : arr)
        {
            total = total + n;
        }
        System.out.println("Sum of the element in the array is "+total);

    }

    public static void main(String args[])
    {
        int elements ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to insert into array");
        elements = sc.nextInt();
        int arr[] = new int[elements];

        System.out.println("Enetr the elements into array");
        for(int i = 0 ; i<arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }
         
        sumOfElement sum = new sumOfElement();
        sum.sumOfArray(arr);
    }
}

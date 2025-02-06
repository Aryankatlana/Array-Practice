import java.util.Scanner;

public class insertionIntoArray {
    public static void addToBegnning(int arr[] , int num)
    {
        int size = arr.length + 1 ;
        int newArr[] = new int[size];
        newArr[0] = num;

        for(int i = 1 ; i < size ; i++)
        {
            newArr[i] = arr[i-1];
        }
        System.out.println("After insert into begnning to the array");
        for(int n : newArr)
        {
            System.out.println(n);
        }
    } 
    public static void addToEnd(int arr[] , int num)
    {
        int size = arr.length + 1 ;
        int newArr[] = new int[size];
        newArr[size-1] = num;

        for(int i = 0 ; i < size-1 ; i++)
        {
            newArr[i] = arr[i];
        }
        System.out.println("After insert into End to the array");
        for(int n : newArr)
        {
            System.out.println(n);
        }
    } 
    public static void addAtplace(int arr[], int element , int index)
    { 
        int size = arr.length + 1 ;
        int newArr[] = new int[size];
        for(int i = 0 ; i < index ; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[index] = element;
        for(int j = index+1 ; j< newArr.length ; j++)
        {
            newArr[j] = arr[j-1];
        }
        System.out.println("After insert element into the specific index to the array");
        for(int n : newArr)
        {
            System.out.println(n);
        }

    }

    public static void main(String args[])
    {
        int arr[] = new int[]{1,2,3,4,5};
        int element ;
        System.out.println("Enter element into Array");
        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();
        addToBegnning(arr, element);   
        addToEnd(arr, element);
        System.out.println("Enter the number of index ");
        int index = sc.nextInt();
        addAtplace(arr,element,index);

    }
}

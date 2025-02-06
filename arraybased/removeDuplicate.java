import java.util.Scanner;

public class removeDuplicate {
    void remove(int arr[])
    {
        int newArr[] = new int[arr.length];
        int n = 0 , less = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = i ; j < arr.length ; j++)
            {
                if(arr[i] == arr[j] && i != j)
                {
                    less++;
                    break;
                }
                else if(j == arr.length-1 )
                {
                    newArr[n] = arr[i];
                    n++;
                }
            }
        }
        System.out.println("After removing the duplicate element from array-------------");
        for(int num = 0 ; num <(newArr.length-less) ; num++)
        {
            System.out.print(newArr[num]+" ");
        }

    }
    public static void main(String args[])
    {
        int element ;
        System.out.println("Enter the number of element you want to enter");
        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();

        int arr[] = new int[element];
        System.out.println("Enter the elements into array");

        for(int n = 0 ; n< arr.length ; n++)
        {
            arr[n] = sc.nextInt();
        }
        removeDuplicate ans = new removeDuplicate();
        ans.remove(arr);
    }
}
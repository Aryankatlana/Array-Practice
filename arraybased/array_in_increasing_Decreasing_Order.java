import java.util.Scanner;

public class array_in_increasing_Decreasing_Order {
    void increToDecrease(int arr[])
    {
        int divide = (arr.length/2);
        for(int i = 0 ; i < divide ; i++)
        {
            int increase = arr[i];
            for(int j = i ; j < arr.length ; j++)
            {
                if(increase > arr[j])
                {
                    int temp = increase;
                    increase = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = increase;
        }
        int n , decrease ;
        for(n = divide ; n < arr.length  ; n++)
        {
             decrease = arr[n];
            for(int p = n ; p < arr.length ; p++)
            {
                if(decrease < arr[p])
                {
                    int temp = decrease;
                    decrease = arr[p];
                    arr[p] = temp;
                }
            }
            arr[n] = decrease;
        }
        System.out.println("Answer is ---------");
        for(int ans : arr)
        {
            System.out.println(ans);
        }

    }
    public static void main(String args[])
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
        array_in_increasing_Decreasing_Order ans = new array_in_increasing_Decreasing_Order();
        ans.increToDecrease(arr);


    }
}

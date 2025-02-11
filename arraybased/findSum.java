import java.util.Scanner;

public class findSum{
    public static void sum(int num , int arr[])
    {
        int total = 0 ;
        for(int i = 0; i < arr.length ; i++)
        {
            total += num*arr[i];
            System.out.println(total);
        }
        System.out.println("Sum of :"+total);
    }
    public static void main(String args[])
    {
        int num ;
        int arr[] = new int[]{2,4,16,3,81,7,98};
        System.out.println("Enetr a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sum(num, arr);

    }
    
}

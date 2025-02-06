import java.util.Scanner;

public class CountFrequency {
    void ferquency(int arr[])
    {
        for(int i = 0 ;i < arr.length ; i++)
        {
            int count = 0;
            for(int j = i ; j < arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            for(int k = 0 ; k <= i ; k++)
            {
                if(arr[k] == arr[i] && k!=i)
                {
                    break;
                }
                else if((arr[i] != arr[k] && k==i) || (k == i && count > 0))
                {
                    System.out.println(arr[i]+" "+ count);
                    count = 0;
                }
            }
            
        }
    }
    public static void main(String args[])
    {
        int element ;
        System.out.println("Enter the number of element you want to insert into array");
        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();
        int arr[] = new int[element];

        System.out.println("Enter the elements into array");
        for(int i = 0 ;i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("----------");
        CountFrequency ans = new CountFrequency();
        ans.ferquency(arr);

    }
}

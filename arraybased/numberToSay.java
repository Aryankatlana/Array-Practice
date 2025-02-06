import java.util.Scanner;

public class numberToSay {
    void say(int num , String arr[])
    {
        if(num == 0)
        {
            return;
        }

        int digit = num % 10;
        num = num/10;

        say(num , arr);
        System.out.println(arr[digit]);
    }
    public static void main(String args[])
    {
        int num ;
        String arr[] = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Reverse print the digit into Spaling");
        
        while (num != 0) 
        {
            int digit = num % 10;
            num = num/10;

            System.out.println(arr[digit]);
        }
    }
}


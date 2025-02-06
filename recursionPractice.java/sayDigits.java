import java.util.Scanner;

public class sayDigits {
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

        sayDigits ans = new sayDigits();
        ans.say(num , arr);
    }
}

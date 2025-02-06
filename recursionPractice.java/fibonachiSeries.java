import java.util.Scanner;

public class fibonachiSeries {
    int fiboSeries(int num)
    {
        if(num == 0)
        return 0;

        if(num == 1)
        return 1;

        int ans = fiboSeries(num - 1) + fiboSeries(num - 2);
        return ans;
    }
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        fibonachiSeries ans = new fibonachiSeries();
        int res = ans.fiboSeries(num);
        System.out.println(res);
    }
}

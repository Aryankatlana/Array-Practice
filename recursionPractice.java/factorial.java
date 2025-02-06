import java.util.Scanner;

public class factorial {
    int countFact(int num)
    {
        if(num == 1)
        return 1;

        int small = countFact(num-1);
        int big = num * small;

        return big;

    }
    public static void main(String args[])
    {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        factorial ans = new factorial();
       int fact =  ans.countFact(num);
       System.out.println("Factorial is "+fact);
    }
}

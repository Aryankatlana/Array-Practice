import java.util.Scanner;

public class fibonachiSeriesUsingArray {

    public static void main(String args[])
  {
      int num;
      System.out.println("Enter a number");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
      
      int arr[] = new int[num];
      arr[0] = 0;
      arr[1] = 1;
      for(int i = 2 ; i < num ; i++)
      {
           arr[i] = arr[i-1] + arr[i-2];
      }
      System.out.println("Fibonachi series is");
      for(int n : arr)
      {
           System.out.println(n);
      }
  }

}
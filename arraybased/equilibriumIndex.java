public class equilibriumIndex {
    public static void check(int arr[])
    {
        int leng = (arr.length/2);
        int totalLeft = 0 ;
        int totalRight = 0;
        for(int i = 0 ; i < leng ; i++)
        {
            totalLeft = totalLeft + arr[i];
        }
        for(int i = leng+1 ; i < arr.length ; i++)
        {
            totalRight = totalRight + arr[i];
        }
        if(totalLeft == totalRight)
        {
            System.out.println("Equilibrium index is "+leng);
        }
        else
        {
            System.out.println("There is no Equilibrium index");
        }
    }
    public static void main(String args[])
    {
        int arr[] = new int[]{9,3,7,6,8,1,10};
        check(arr);

    }
}

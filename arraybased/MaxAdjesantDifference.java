public class MaxAdjesantDifference {
    public static int maxAd(int nums[])
    {
        int diff , maxDiff = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            diff = Math.abs(nums[i] - nums[(i+1) % nums.length]);
            maxDiff = Math.max(diff , maxDiff);
        }
        return maxDiff;

    }
    public static void main(String args[])
    {
        int nums[] = new int[]{-2,1,-5};
        int ans = maxAd(nums);
        System.out.println(ans);

    }
}

public class leetCodeQuestion {
    public static double minimumAverage(int[] nums) {
        float minimumEle = 0 ;
        int n = nums.length/2;
        float averages[] = new float[n];
        for(int i = 0 ; i< nums.length ; i++)
        {
            for(int j = i ; j < nums.length ; j++)
            {
                if(nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int p = 0 ; p < nums.length/2 ; p++)
        {
            int minElement = nums[p];
            int maxElement = nums[(nums.length- 1) - p];
            double add = (minElement + maxElement) / 2.0;
            averages[p] = (float)add;
        }
        minimumEle = averages[0];
        for(int m = 0 ; m < averages.length ; m++)
        {
            if(minimumEle > averages[m])
            {
                minimumEle = averages[m];
            }
        }
        return minimumEle;
    }
    public static void main(String args[])
   {
    int nums[] = new int[]{7,8,3,4,15,13,4,1};
    float ans = (float) minimumAverage(nums);
    System.out.println(ans);
  } 
}


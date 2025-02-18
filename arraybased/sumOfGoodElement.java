public class sumOfGoodElement {
        public int sumOfGoodNumbers(int[] nums, int k) {
            int sum = 0 ;
            for(int i = 0 ; i < nums.length ; i++)
            {
                if(((i-k) >= 0 && (i+k) < nums.length))
                {
                    if(nums[i] > nums[i-k] && nums[i] > nums[i+k])
                    {
                        sum += nums[i];
                    }
                }
                else if((i-k) >= 0)
                {
                    if(nums[i] > nums[i-k])
                    {
                        sum += nums[i];
                    }
                }
                else if((i+k) < nums.length)
                {
                    if(nums[i] > nums[i+k])
                    {
                        sum += nums[i];
                    }
                }
            }
            return sum;
        }
        public static void main(String args[])
        {
            int arr[] = new int[]{1,3,2,1,5,4};
            int element = 2;
            sumOfGoodElement ans  = new sumOfGoodElement();
            System.out.println(ans.sumOfGoodNumbers(arr , element));


        }
    }

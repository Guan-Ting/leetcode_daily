package org.example.array;

/**
 * ClassName: minSubArrayLen
 * Package: org.example.array
 * Description:
 */
public class minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;//起始位置
        int sum = 0;
        int result = Integer.MAX_VALUE;
        //right 終止位子
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {

        int[] sums = {2,3,1,2,4,3};

        minSubArrayLen minSubArrayLen = new minSubArrayLen();
        int result = minSubArrayLen.minSubArrayLen(7,sums);
        System.out.println("result:"+result);
    }
}

package org.example.array.practice;

/**
 * ClassName: minSubArrayLen
 * Package: org.example.array
 * Description:
 */
public class minSubArrayLen2 {
    public int minSubArrayLen(int s, int[] nums) {
        //  int[] sums = {2,3,1,2,4,3};
        int start = 0 ;
        int result = Integer.MAX_VALUE;
        int sum = 0 ;

        for (int end = 0 ; end < nums.length ; end ++){
            sum = sum + nums[end];
            while (sum >= s){
                //更新result
                result = Math.min(result,end - start +1);
                sum = sum - nums[start];
                start ++ ;
            }

        }
        return result == Integer.MAX_VALUE ? 0 : result  ;

    }

    public static void main(String[] args) {

        int[] sums = {2,3,1,2,4,3};

        minSubArrayLen2 minSubArrayLen = new minSubArrayLen2();
        int result = minSubArrayLen.minSubArrayLen(7,sums);
        System.out.println("result:"+result);
    }
}

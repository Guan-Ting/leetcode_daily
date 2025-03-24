package org.example.array;

/**
 * ClassName: SortedSquares
 * Package: org.example.array
 * Description:
 */
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 正数的相对位置是不变的， 需要调整的是负数平方后的相对位置
                result[index--] = nums[left] * nums[left];
                left++;
            } else {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10,100};
        SortedSquares sortedSquares = new SortedSquares();
        sortedSquares.sortedSquares(nums);
    }
}

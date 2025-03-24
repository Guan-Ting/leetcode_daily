package org.example.array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while(right >= 0 && nums[right] == val) right--; //将right移到从右数第一个值不为val的位置
        while(left <= right) {
            if(nums[left] == val) { //left位置的元素需要移除
                //将right位置的元素移到left（覆盖），right位置移除
                nums[left] = nums[right];
                right--;
            }
            left++;
            while(right >= 0 && nums[right] == val) right--;
        }
        return left;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] array = {1, 2, 3, 4, 5};
        int n =removeElement.removeElement(array,3);
        System.out.println("n:"+ n);
    }
}

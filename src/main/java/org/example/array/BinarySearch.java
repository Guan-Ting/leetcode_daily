package org.example.array;

public class BinarySearch {

//    public static int binarySearch(int[] nums, int target){
//        if (nums == null || nums.length == 0) {
//            return -1;
//        }
//
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            // 計算中間索引
//            int mid = left + (right - left) / 2;
//
//            // 找到目標
//            if (nums[mid] == target) {
//                return mid;
//            }
//            // 目標在左半部分
//            else if (nums[mid] > target) {
//                right = mid - 1;
//            }
//            // 目標在右半部分
//            else {
//                left = mid + 1;
//            }
//        }
//
//        // 未找到目標
//        return -1;
//
//    }

    public  static int binarySearch(int[] nums,int target){
        if (nums == null  ||  nums.length ==0 ){
            return -1 ;
        }

        int left = 0 ;
        int right = nums.length -1 ;

        while (left <= right ){

            int mid = left + (right - left ) / 2 ;

            if (nums[mid] == target){
                return mid ;
            }
            //表示在左邊
            else if (nums[mid] > target) {
               right = mid - 1;
            } else {
                //表示在右邊
                left = mid +1 ;
            }


        }

        return -1 ;
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17,19};
        int target = 15;

        // 使用迭代方法
        int result1 = binarySearch(sortedArray, target);

        System.out.println("result1:"+result1);


    }
}

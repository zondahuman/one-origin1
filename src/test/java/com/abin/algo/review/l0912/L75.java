package com.abin.algo.review.l0912;

/**
 * 75. 颜色分类
 */
public class L75 {
    /**
     * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地 对它们进行排序，
     * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
     * @param nums
     */
    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length-1;
        int p = 0;
        while (p<=p2) {
            if(nums[p] == 0){
                swap(nums, p0, p);
                p0++;
            }else if(nums[p] == 2){
                swap(nums, p2, p);
                p2--;
            }else if(nums[p] == 1){
                p++;
            }
            if(p<p0){
                p = p0;
            }
        }
    }

    void swap(int[] nums, int one, int two){
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }



    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


}

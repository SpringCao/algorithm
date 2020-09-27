package array.有序数组的平方和;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-4,-3,0,2,3,9};
        int[] ints = sortedArray(a);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] sortedArray(int[] nums){
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while (i <= j){
            if (nums[i] + nums[j] < 0){
                res[k] = nums[i] * nums[i];
                k--;
                i++;
            }else {
                res[k] = nums[j] * nums[j];
                k--;
                j--;
            }
        }
        return res;
    }
}

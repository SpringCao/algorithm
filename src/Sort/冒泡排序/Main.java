package Sort.冒泡排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {3,8,7,1,4,5,2,9};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] nums){
        for (int i = nums.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}

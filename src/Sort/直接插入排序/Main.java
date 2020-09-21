package Sort.直接插入排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {3,8,7,1,4,5,2,9,1};
        straightInsertSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void straightInsertSort(int[] nums){
        int j,temp;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            j = i - 1;
            while (j >=0 && temp < nums[j]){
                nums[j+1] = nums[j];
                --j;
            }
            nums[j+1] = temp;
        }
    }
}

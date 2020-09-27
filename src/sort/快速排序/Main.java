package sort.快速排序;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {3,8,7,1,4,5,2,9};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] nums,int low,int high){
        int i,j,k,temp;
        if (low > high){
            return;
        }
        i = low;
        j = high;
        temp = nums[low];
        while (i < j){
            while (nums[j] >= temp && i < j){
                j--;
            }
            while (nums[i] <= temp && i < j){
                i++;
            }
            if (i < j){
                k = nums[i];
                nums[i] = nums[j];
                nums[j]= k;
            }
        }
        nums[low] = nums[j];
        nums[j] = temp;
        quickSort(nums,low,i-1);
        quickSort(nums,i+1,high);
    }
}

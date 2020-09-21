package array.三数之和;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum2(nums));
    }

    //暴力算法
    private static Set<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list1 = Arrays.asList(nums[i], nums[j], nums[k]);
                        set.add(list1);
                    }
                }
            }
        }
        return set;
    }

    private static List<List<Integer>> threeSum2(int[] nums){
        if (nums == null || nums.length <= 2){
            return Collections.emptyList();
        }
        Set<List<Integer>> set = new LinkedHashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                int sum = 0 - (nums[j] + nums[k]);
                if (nums[i] == sum){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    set.add(list);
                }
                if (nums[i] <= sum){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}

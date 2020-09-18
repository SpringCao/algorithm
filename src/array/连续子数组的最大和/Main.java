package array.连续子数组的最大和;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,-9,8};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] arr){
        int l = arr.length;
        int[] dp = new int[l];
        dp[0] = arr[0];
        int res = dp[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    //空间复杂度为O(1);
    private static int maxSubArray2(int[] nums){
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(nums[i],res);
        }
        return res;
    }
}

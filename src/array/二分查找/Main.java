package array.二分查找;

/**
 * 查找数组中某个值的索引,如果该值不存在，则返回应该插入的位置
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,15};
        System.out.println(binarySearch2(7, arr,0,5));
    }

    //非递归
    private static int binarySearch(int k,int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high){
            mid = low + (high - low) / 2;
            if (arr[mid] == k){
                return mid;
            }else if (arr[mid] > k){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int binarySearch2(int k ,int[] arr,int low,int high){
        int mid = low + (high - low) / 2;
        if (arr[mid] > k){
            return binarySearch2(k,arr,low,mid-1);
        }else if (arr[mid] < k){
            return binarySearch2(k,arr,mid+1,high);
        }else {
            return mid;
        }
    }
}

package BinarySearch;

public class _33M_SearchinRotatedSortedArray {
    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            // 找到返回
            if (target==nums[mid]){
                return mid;
            }
            // 先判断前半段是否 sorted
            if (nums[start] <= nums[mid]) {
                // 判断是否在前半段区间
                if (target >= nums[start]&& target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // 前半段不是 sorted
            else {
                // 判断是否在后半段区间
                if ( target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return - 1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums,0));

    }
}

package TwoPoint;

public class _167M_TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length-1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                return new int[]{++start, ++end};
            }
        }
        return new int[]{};
    }
}

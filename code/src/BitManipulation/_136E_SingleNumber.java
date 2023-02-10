package BitManipulation;

public class _136E_SingleNumber {
    public int singleNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;

    }
}

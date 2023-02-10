package BitManipulation;

public class _7M_ReverseInteger {

    public static int reverse(int x) {

        int negLastDigit = Integer.MIN_VALUE % 10;
        int poLastDigit = Integer.MAX_VALUE % 10;
        int result = 0;


        while (x != 0) {

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && x / 10 > poLastDigit)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && x / 10 < negLastDigit)) {
                return 0;
            }

            result = result * 10 + x % 10;
            x = x / 10;


        }
        return result;

    }

    public static void main(String[] args) {
    }

}

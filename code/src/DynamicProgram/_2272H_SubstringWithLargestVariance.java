package DynamicProgram;


public class _2272H_SubstringWithLargestVariance {


    public int largestVariance(String s) {

        int dp1;
        int dp2;
        int ans = 0;

        for (char i = 'a'; i <='b' ; i++) {

            for (char j = 'a'; j <='b' ; j++) {

                if (i==j){
                    continue;
                }

                dp1 = 0;
                dp2 = Integer.MIN_VALUE;

                for (int k = 0; k < s.length(); k++) {

                    if (s.charAt(k) == i) {
                        dp1 = Math.max(dp1, 0) + 1;
                        dp2 = dp2 + 1;
                    } else if (s.charAt(k) == j) {
                        dp2 = Math.max(dp1, 0) - 1;
                        dp1 = Math.max(dp2, 0);

                    }

                    ans = Math.max(dp2, ans);
                }
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        _2272H_SubstringWithLargestVariance aaa = new _2272H_SubstringWithLargestVariance();
        aaa.largestVariance("aabcdaa");
    }


}

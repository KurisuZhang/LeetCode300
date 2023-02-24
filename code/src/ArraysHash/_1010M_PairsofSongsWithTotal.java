package ArraysHash;

public class _1010M_PairsofSongsWithTotal {

    public int numPairsDivisibleBy60(int[] time) {

        int[] freq = new int[60];
        int result = 0;


        for (int i = time.length-1; i >-1; i--) {

            int reminder = time[i] % 60;

            if (reminder == 0) {
                result = result + freq[0];
            } else {
                result = result + freq[60 - reminder];
            }

            freq[reminder] += 1;



        }
        return result;
    }

}

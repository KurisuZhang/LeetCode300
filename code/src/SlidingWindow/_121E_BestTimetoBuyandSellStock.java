package SlidingWindow;

public class _121E_BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int result = 0;

        for (int price : prices) {

            if (price < minValue) {
                minValue = price;
            }

            result = Math.max(result, price - minValue);
        }

        return result;

    }
}

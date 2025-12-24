public class buysellstock {
    public static void main(String[] args) {
        int[] prices = {9,6,2,8,1};
        int n = prices.length;
//        for(int i=0; i<n-1; i++ )
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                int sum = arr[j]-arr[i];
//               if((sum>0) && (sum>max))
//               {
//                   max=sum;
//
//               }
//            }
//        }

        int min = prices[0];      // Start with the first day's price
        int maxProfit = 0;        // Start with 0 profit

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];  // Update minimum price if current is lower
            } else {
                int profit = prices[i] - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println(maxProfit);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        /*pricex[i] , i+1 비교 , 비교한값이 떨어지고
pricex[i] , i+1 비교 , 비교한값이 올라가면
일단 선택, 끝까지비교, 큰숫자선택, 얼마나 차이가있는지 저장
아웃풋으로 출력*/

        int maxprofit =0;
        int n = prices.length;
        int[] profits = new int[n * (n - 1) / 2]; // profit들을 저장할 배열
        int index =0;
            for (int i=0; i<prices.length; i++){
                for (int j=i+1; j<prices.length; j++){
                //if(prices[i]> prices[j] ||  prices[i] == prices[j])
                //return 0;
                    if( prices[i] < prices[j]){
                        int profit = prices[j]-prices[i];
                        profits[index++] = profit;
                        
                        if (profit > maxprofit) {
                        maxprofit = profit;
                        }
                    }
                    }
                    }
                    return maxprofit;
            }
    }
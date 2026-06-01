package Week_1.Day_1;

public class Stock_1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int ans = maxProfit(nums);
        System.out.println(ans);
    }

    public static int maxProfit(int[] nums) {

        int buy = nums[0];
        int profit = 0;

        for (int i = 1; i < nums.length; i++) {
            buy = Math.min(buy, nums[i]);
            profit = Math.max(profit, nums[i] - buy);
        }

        return profit;
    }
}
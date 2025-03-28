import java.util.*;

public class Array {
    public static int maxProfit(int[] nums) {
        int buy = nums[0];
        int profit = 0;
        for (int i = 1; i < nums.length; i++) {
            if (buy < nums[i]) {
                profit = Math.max(nums[i] - buy, profit);
            } else {
                buy = nums[i];
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 3, 5, 8, 4, };
        System.out.println(maxProfit(nums));

    }
   }

package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinimumCoinProblem {

    // Step 1: Sort the coins in decreasing order
    // Step 2: Try to maximum amount with current coin.
    // Step 3: For Remaining amount move to next coin.

    public int minCoins(int coins[], int amount) {
        int totalCoins = 0;
        int[] reverseSortedCoins = Arrays
                .stream(coins)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        for (int i = 0; i < reverseSortedCoins.length; i++) {
            if (reverseSortedCoins[i] <= amount) {
                int noOfCoins = (int) Math.floor(amount / coins[i]);
                totalCoins += noOfCoins;
                amount -= noOfCoins * reverseSortedCoins[i];
            }
            if (amount == 0) {
                break;
            }
        }

        return totalCoins;
    }
}

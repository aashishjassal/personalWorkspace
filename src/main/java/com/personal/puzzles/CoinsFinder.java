package com.personal.puzzles;

import java.util.concurrent.atomic.AtomicInteger;

public class CoinsFinder {

    public static void main(String[] args) {
        int[] coins = {5, 10, 20};
        int sum = 30;
        // Combinations are
        // 5,5,5,5,5,5
        // 10,10,10
        // 20,10
        // 5,5,10,10
        // 5,5,20
        // 5,5,5,5,10
        AtomicInteger possibleCombinations = new AtomicInteger(0);
        findMatch(coins, sum, possibleCombinations, "");
        System.out.println(possibleCombinations);

        sum = 50;
        // Combinations are
        // 5,5,5,5,5,5,5,5,5,5
        // 10,10,10,10,10
        // 10,10,10,20
        // 20,20,10
        // 5,5,5,5,5,5,5,5,10
        // 5,5,5,5,5,5,10,10
        // 5,5,5,5,5,5,20
        // 5,5,5,5,10,10,10
        // 5,5,5,5,20,10
        // 5,5,10,10,10,10
        // 5,5,20,10,10
        // 5,5,20,20

        // possibleCombinations = new AtomicInteger(0);
        // findMatch(coins, sum, possibleCombinations);
        // System.out.println(possibleCombinations);
    }

    public static void findMatch(int[] coins, int sum, AtomicInteger possibleCombinations, String existingCoinsStr) {
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            int multipleValue = coin;
            if (sum == 0) {
                return;
            }
            if (sum % coin == 0) {
                System.out.println(existingCoinsStr + " and coin: " + coin
                        + " with number of coins: " + (sum / coin));
                possibleCombinations.incrementAndGet();
            }
            int[] newCoins = partialArray(coins, i + 1);
            multipleValue += coin;
            while (multipleValue <= sum) {
                // System.out.println("Now checking with " + (multipleValue / coin) + " coins of " + coin
                // + " for remaining sum: "
                // + (sum - multipleValue));
                findMatch(newCoins, (sum - multipleValue), possibleCombinations,
                        (multipleValue / coin) + " number of coin: " + coin);
                multipleValue += coin;

            }
        }
    }
    
    public static int[] partialArray(int[] coins, int startIndex) {
        int[] newCoins = new int[coins.length - startIndex];
        for (int i = 0; i < newCoins.length; i++) {
            newCoins[i] = coins[startIndex + i];
    }
        return newCoins;
    }


}

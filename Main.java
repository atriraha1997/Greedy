import problems.MinimumCoinProblem;

public class Main {

    public static void main(String[] args){
        MinimumCoinProblem minimumCoinProblem = new MinimumCoinProblem();
        int[] coins = new int[]{10,5,2,1};
        int amount = 57;
        int totalCoins = minimumCoinProblem.minCoins(coins,amount);
        System.out.println("Minimum number of coins used to achieve amount: "+totalCoins);
    }
}

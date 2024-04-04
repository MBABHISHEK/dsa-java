class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memory = new int[amount+1];

        for(int i = 1; i<=amount; i++){
            int count = Integer.MAX_VALUE; 
            for(int coin: coins){
                if(i>=coin&&memory[i-coin]!=Integer.MAX_VALUE){
                    count = Math.min(count, memory[i-coin]+1);
                }
            }
            memory[i] = count;
        }

        return memory[amount]==Integer.MAX_VALUE?-1:memory[amount];
    }
}

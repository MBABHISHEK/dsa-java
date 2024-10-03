class Solution {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[] happy = new int[n];

        for (int[] pair : pairs) {
            int i = pair[0];
            int j = pair[1];
            happy[i] = indexOf(preferences[i], j);
            happy[j] = indexOf(preferences[j], i);
        }
        
        int unhappy = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < happy[i]; j++) {
                int partner = preferences[i][j];
                if (indexOf(preferences[partner], i) < happy[partner]) {
                    unhappy++;
                    break;
                }
            }
        }
        
        return unhappy;
    }
    
    private int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // should not happen as value is always in arr
    }
}

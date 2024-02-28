class Solution {
    public int arrangeCoins(int n) {
        int i = 1; // which row we are on
		while(n > 0){ // checking to see if we have used all our coins
			i++; // increasing our row
			n = n-i; // adding coins to our row
		}
		return i-1; // we return our current row minus one because the last row is our completed row
    }
}

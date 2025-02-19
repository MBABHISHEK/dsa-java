class Solution {
    private String ans = "";
    private void solve(int len, int[] cnt, int n, char[] v, StringBuilder s) {
        if (len == n) {
            if (--cnt[0] == 0) {
                ans = s.toString();
            }
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (len == 0 || s.charAt(s.length() - 1) != v[i]) {
                s.append(v[i]);
                solve(len + 1, cnt, n, v, s);
                s.deleteCharAt(s.length() - 1);
                if (cnt[0] == 0) return;
            }
        }
    }

    public String getHappyString(int n, int k) {
        char[] v = {'a', 'b', 'c'};
        ans = "";
        StringBuilder s = new StringBuilder();
        int[] cnt = {k}; // Using array to simulate pass-by-reference for integer
        solve(0, cnt, n, v, s);
        return ans;
    }
}

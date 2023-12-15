class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character, Integer> count = new HashMap<>();
int maxcount = 0;
int maxlength = 0;
int left = 0;

for (int right = 0; right < s.length(); right++) {
    count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);
    maxcount = Math.max(maxcount, count.get(s.charAt(right)));

    while (right - left + 1 - maxcount > k) {
        count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
        left++;
    }

    maxlength = Math.max(maxlength, right - left + 1);
}

return maxlength;

    }
}

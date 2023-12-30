public class Solution {
    public boolean makeEqual(String[] words) {
        // Count the occurrences of each character in all words
        Map<Character, Integer> charCount = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Check if the counts are divisible by the number of words
        int numWords = words.length;
        for (int count : charCount.values()) {
            if (count % numWords != 0) {
                return false;
            }
        }

        return true;
    }

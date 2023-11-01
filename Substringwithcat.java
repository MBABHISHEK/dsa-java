class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
          List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;

        for (int i = 0; i <= s.length() - totalLen; i++) {
            String substr = s.substring(i, i + totalLen);
            Map<String, Integer> tempMap = new HashMap<>(wordMap);
            for (int j = 0; j < totalLen; j += wordLen) {
                String word = substr.substring(j, j + wordLen);
                if (!tempMap.containsKey(word)) {
                    break;
                }
                tempMap.put(word, tempMap.get(word) - 1);
                if (tempMap.get(word) == 0) {
                    tempMap.remove(word);
                }
            }
            if (tempMap.isEmpty()) {
                result.add(i);
            }
        }

        return result;
    }
}





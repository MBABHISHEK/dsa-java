class Solution {
    public String firstPalindrome(String[] words) {

        for(String word:words)
        {
            StringBuilder reversed =new StringBuilder(word).reverse();
            if(word.equals(reversed.toString()))
            {
                return word;
            }
        }
        return "";      
    }
}

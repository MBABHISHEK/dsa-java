class Palindrome {
    boolean isPalindrome(String str) {
        // Base case: If the length of the string is 0 or 1, it's a palindrome
        if (str.length() <= 1)
            return true;
        
        // Check if the first and last characters are the same
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        
        // Recursively check if the substring excluding the first and last characters is a palindrome
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}

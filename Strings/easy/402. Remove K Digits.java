import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        // Stack to store the digits
        Stack<Character> numStack = new Stack<>();
        
        // Iterating through each digit in the number
        for (char digit : num.toCharArray()) {
            // While there are remaining removals (k) and the stack is not empty and the current digit is smaller than the top of the stack
            while (k > 0 && !numStack.isEmpty() && digit < numStack.peek()) {
                // Remove digits from the stack
                numStack.pop();
                k--;
            }
            // Push the current digit to the stack
            numStack.push(digit);
        }
        
        // After iterating through the number, if there are still remaining removals, remove digits from the stack
        while (k > 0 && !numStack.isEmpty()) {
            numStack.pop();
            k--;
        }

        // Construct the result string by popping digits from the stack
        StringBuilder temp = new StringBuilder();
        while (!numStack.isEmpty()) {
            temp.append(numStack.pop());
        }
        // Reverse the result string to get the correct order
        temp.reverse();

        // Remove leading zeros and construct the final result
        int m = temp.length();
        StringBuilder result = new StringBuilder();
        int foundNonZero = 0;
        for (int i = 0; i < m; i++) {
            if (temp.charAt(i) == '0' && foundNonZero == 0) {
                continue;
            } else {
                result.append(temp.charAt(i));
                foundNonZero = 1;
            }
        }
        // If the result is empty, return "0"
        if (result.length() == 0)
            result.append('0');
        return result.toString();
    }
}

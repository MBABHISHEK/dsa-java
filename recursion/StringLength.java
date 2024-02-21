class StringLength {
    int stringLength(String str) {
        // Base case: If the string is empty, return 0
        if (str.isEmpty())
            return 0;
        // Recursive case: Return 1 plus the length of the substring excluding the first character
        return 1 + stringLength(str.substring(1));
    }
}

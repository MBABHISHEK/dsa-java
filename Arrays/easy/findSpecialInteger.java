class Solution {
    public int findSpecialInteger(int[] arr) {
        int threshold = arr.length / 4;

        for (int i = 0; i < arr.length - threshold; i++) {
            if (arr[i] == arr[i + threshold]) {
                return arr[i];
            }
        }

        // If no element is found, you may return -1 or handle it as needed
        return -1;
        
    }
}

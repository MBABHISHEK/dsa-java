class Solution {
    public int hIndex(int[] citations) {
         Arrays.sort(citations);
        int n = citations.length; // Get the length of the array.

       int low=0 , high =n;
        while(low < high){
            int mid = (low+high+1)/2;
            int cnt=0;
            for(int i=0 ; i<n ; i++) 
            if(citations[i] >= mid) 
            cnt++;
            if(cnt >= mid) 
            low = mid;
            else high = high=mid-1;
        }
        return low;
    }
}

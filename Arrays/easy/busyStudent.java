class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int answer = 0;
        for(int i=0,j=0;i<startTime.length && j<endTime.length;i++,j++)
            if(startTime[i]<=queryTime && endTime[j]>=queryTime)
                answer++;
        return answer;
    }
}

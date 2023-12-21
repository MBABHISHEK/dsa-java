import java.util.*;
class Solution {
    public int countSegments(String s) {
        StringTokenizer st=new StringTokenizer(s," ");
        int count=0;
        while(st.hasMoreTokens())
        {
            count++;
            st.nextToken();
        }

        return count;
    }
}


/*
class Solution {
    public int countSegments(String s) {
       if(s.length()==0){
           return 0;
       }
       String[] words = s.split("\\s+");

        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        return wordCount;

    }
}*/

import java.util.*;
public class Solution {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.

        int n=A.size();

        int i=n-2;

        while(i>=0&&A.get(i)>=A.get(i+1))
        {
            i--;
        }
        if(i>=0)
        {
            int j=n-1;
            while(A.get(i)>=A.get(j))
            {
                j--;
            }
             Collections.swap(A, i, j);
        }

         reverse(A, i + 1, n - 1);

         return A;


    }

    static void  reverse(List<Integer>temp,int start,int end)
    {
          
          while(start<end)
          {
            Collections.swap(temp, start, end);
            start++;
            end--;
          }
    }
}

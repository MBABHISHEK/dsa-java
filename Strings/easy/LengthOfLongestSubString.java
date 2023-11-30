/*class Solution {
    public int lengthOfLongestSubstring(String s) 
     {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
 ,
        return maxLen;
    }
   
           
}
*/

/*
 * b
 * 
 * 
 */


 /*import java.util.Scanner;

public class LengthOfLongestSubString
{
  public static void main(String[] args) {
    
    System.out.println("enter the string");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n=s.length();
     char [] c= s.toCharArray();
    int max=0;
     for (int i = 0;i<n;i++)
     {
         for(int j=i+1;j<=n;j++)
         {
             if(isUnique(c,i,j))
             {
                max=Math.max(max,j-1);
             }

         }

     }
     System.out.println(max);
  }

  static Boolean isUnique(char [] s,int start,int end)
  {
        for(int i=start;i<end-1;i++)
        {
          for(int j=i+1;j<end;j++)
          {
            if(s[j] == s[i])
            return false;
          }
        }
      return true;
  }

    
} */
import java.util.Scanner;

public class LengthOfLongestSubString {
    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        System.out.println(n);
        char[] c = s.toCharArray();
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <=n; j++) {
                if (isUnique(c, i, j)) {
                    max = Math.max(max, j - i);
                }
            }
        }
        System.out.println(max);
    }

    static boolean isUnique(char[] s, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            for (int j = i + 1; j < end; j++) {
                if (s[i] == s[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
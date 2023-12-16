class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> count1=new HashMap<>();
        HashMap<Character,Integer> count2=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            count1.put(s.charAt(i),count1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            count2.put(t.charAt(i),count2.getOrDefault(t.charAt(i),0)+1);
        }

        if(count1.equals(count2))
          return true;

          return false;

        
    }
}

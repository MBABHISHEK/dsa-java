class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<magazine.length();i++)
        {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
            //System.out.println(magazine.charAt(i)+" "+map.get(magazine.charAt(i)));
        }
        

        for(int i=0;i<ransomNote.length();i++)
        {
            if(map.containsKey(ransomNote.charAt(i)))
            {
                char c=ransomNote.charAt(i);
                int count=map.get(c);
                if(count>0)
                {
                    map.put(c,count-1);
                }
                else
                return false;
            }
             else
             return false;
        }
        return true;



    }
}

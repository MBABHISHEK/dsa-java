class Solution {
    public boolean checkInclusion(String s1, String s2) {

//if s1 itself is large return false
       if(s1.length()>s2.length()){
           return false;
       } 
       int[]freq=new int[26];
       for(int i=0;i<s1.length();i++){
           freq[s1.charAt(i)-'a']+=1;
           freq[s2.charAt(i)-'a']-=1;
       }
       for(int i=0;i<s2.length()-s1.length();i++){
           if(checkAnagram(freq)){
               return true;
           }
        freq[s2.charAt(i)-'a']+=1;
        freq[s2.charAt(i+s1.length())-'a']-=1;
       } 
       return checkAnagram(freq);
    }
    private boolean checkAnagram(int[]freq){
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}

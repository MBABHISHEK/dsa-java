class Solution {
    public String reverseVowels(String s) {
        char [] word=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        String vowels="aeiouAEIOU";

        while(start<end)
        {
            while(start<end&& vowels.indexOf(word[start])==-1)
                  {
                    start++;
                  }
                  while(start<end&&vowels.indexOf(word[end])==-1)
                  {
                    end--;
                  }
                  char tem=word[start];
                  word[start]=word[end];
                  word[end]=tem;
                  start++;
                  end--;
        }
        String res=new String(word);
        return res;

    }
}

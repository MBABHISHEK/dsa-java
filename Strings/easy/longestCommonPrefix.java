class Solution {
    public String longestCommonPrefix(String[] v) {
       /* StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();*/
         if (v == null || v.length == 0) {
            return "";
        }
    String prefix = v[0];
        for(int i=1;i<v.length;i++)
        {
           int j=0;
           while(j<prefix.length() && j<v[i].length() && prefix.charAt(j)==v[i].charAt(j))
           j++;

           prefix=prefix.substring(0,j);
           if(prefix.isEmpty())
           break;

        }
        return prefix;
    }
}

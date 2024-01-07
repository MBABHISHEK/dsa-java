class Solution {
    public String[] findWords(String[] words) {
    List<String> validWords = new ArrayList<>();
        for (String word : words) {
            if (check(word)) {
                validWords.add(word);
            }
        }
        return validWords.toArray(new String[0]);
    }

    public boolean check( String st){
       StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        String s1 = "qwertyuiop";
        String s2 ="asdfghjkl";
        String s3= "zxcvbnm";

        sb1.append(s1);
        sb2.append(s2);
        sb3.append(s3);

          int count =0;
          for(int i=0;i<st.length();i++)
           for(int j=0;j<sb1.length();j++){
           char ch = Character.toLowerCase(st.charAt(i));
           if(ch!=sb1.charAt(j)){
               continue;
           }
           else{
               count++;
               break;
           }
         }

         if(count==st.length()){
             return true;
         }
         else{
             count=0;
         }   
           
          for(int i=0;i<st.length();i++)
           for(int j=0;j<sb2.length();j++){
           char ch = Character.toLowerCase(st.charAt(i));
           if(ch!=sb2.charAt(j)){
               continue;
           }
           else{
               count++;
               break;
           }
         }

         if(count==st.length()){
             return true;
         }
         else{
             count=0;
         } 
          
          for(int i=0;i<st.length();i++)
           for(int j=0;j<sb3.length();j++){
           char ch = Character.toLowerCase(st.charAt(i));
           if(ch!=sb3.charAt(j)){
               continue;
           }
           else{
               count++;
               break;
           }
         }

         if(count==st.length()){
             return true;
         }
         else{
             count=0;
         } 

       return false;

    }


}

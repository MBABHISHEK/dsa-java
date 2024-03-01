class Solution {
    public String maximumOddBinaryNumber(String s) {
        char [] chars=s.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
       // Arrays.reverse(chars);
       for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        for(int i=chars.length-1;i>=0;i--)
        {
            if(chars[i]=='1')
            {
                char temp=chars[i];
                chars[i]=chars[chars.length-1];
                chars[chars.length-1]=temp;
                break;
            }
        }

        return new String(chars);
    }
}

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        int count0 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                count1++;
            }
            else {
                count0++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count1 - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < count0; i++) {
            result.append('0');
        }
        result.append('1');
        
        return result.toString();
    }
}

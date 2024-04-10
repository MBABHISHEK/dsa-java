class Solution {
    public int compress(char[] chars) {
        StringBuilder res=new StringBuilder();
        char c=' ';
        int count=0;
        for(int i=0;i<chars.length;i++)
        {
            if(c==' ')
            {
            c=chars[i];
            count=1;
            res.append(c);
            }
            else
            {
                if(chars[i] == c)
                {
                    count++;
                }
                else
                {
                    if(count!=1)
                    {
                        res.append(count);
                    }
                    c=chars[i];
                    count=1;
                    res.append(c);
                }
            }
        }

        if(count!=1)
        {
            res.append(count);
        }
        for(int i=0;i<res.length();i++)
        {
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}

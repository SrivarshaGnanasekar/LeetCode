class Solution 
{
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        String[] st=text.split(" ");
        int ct=0;
        char[] ch=brokenLetters.toCharArray();
        for(String s:st)
        {
            boolean flag=true;
            for(char c:ch)
            {
                if(s.indexOf(c)!=-1)
                {
                    flag=false;
                }
            }
            if(flag)
            {
                ct=ct+1;
            }
        }
        return ct;  
    }
}

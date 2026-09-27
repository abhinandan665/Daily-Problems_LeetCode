class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str=new StringBuilder(s);
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(') cnt++;
        }
        while(cnt-->0){
            int open=str.lastIndexOf("(");
            int close=str.indexOf(")",open);
            String rev=new StringBuilder(str.substring(open+1,close)).reverse().toString();
            str.replace(open,close+1,rev);
        }
        return str.toString();
    }
}
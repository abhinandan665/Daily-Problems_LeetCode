class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int cnt=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(cnt>0){
                    sb.append(ch);
                }
                cnt++;
            }else{
                cnt--;
                if(ch==')'){
                    if(cnt>0){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}
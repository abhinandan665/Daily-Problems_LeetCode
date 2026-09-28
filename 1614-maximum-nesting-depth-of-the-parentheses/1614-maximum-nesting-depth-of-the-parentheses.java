class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int maxDepth=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
                cnt++;
            } 
            else if(s.charAt(i)==')'){
                maxDepth=Math.max(maxDepth,cnt);
                st.pop();
                cnt--;
            }
        }
        return maxDepth;
    }
}
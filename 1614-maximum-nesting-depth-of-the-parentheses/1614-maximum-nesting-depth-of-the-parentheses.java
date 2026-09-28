class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int maxDepth=0;
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push('(');
                cnt++;
            } 
            else if(c==')'){
                maxDepth=Math.max(maxDepth,cnt);
                st.pop();
                cnt--;
            }
        }
        return maxDepth;
    }
}
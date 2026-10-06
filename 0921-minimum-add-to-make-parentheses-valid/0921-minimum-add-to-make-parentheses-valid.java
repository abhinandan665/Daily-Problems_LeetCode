class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push(ch);
            else{
                if(st.isEmpty()) ans++;
                else{
                    if(st.peek()=='(') st.pop();
                    else ans++;
                }
            }
        }
        return ans+st.size();
    }
}
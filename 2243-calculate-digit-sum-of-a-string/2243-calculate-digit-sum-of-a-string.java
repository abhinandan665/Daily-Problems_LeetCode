class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                String str=s.substring(i,Math.min(i+k,s.length()));
                int digit=0;
                for(int j=0;j<str.length();++j){
                    digit+=Character.getNumericValue(str.charAt(j));
                }
                sb.append(digit);
            }
            s=sb.toString();
        }
        return s;
    }
}
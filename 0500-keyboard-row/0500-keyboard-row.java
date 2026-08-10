class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        List<String> list=new ArrayList<>();
        for(String s1:words){
            String s2=s1.toLowerCase();
            String row="";
            String ch=String.valueOf(s2.charAt(0));
            if(row1.contains(ch)) row=row1;
            else if(row2.contains(ch)) row=row2;
            else row=row3;
            boolean samerow=true;
            for(int i=1;i<s2.length();i++){
                ch=String.valueOf(s2.charAt(i));
                if(!row.contains(ch)){
                    samerow=false;
                    break;
                }
            }
            if(samerow) list.add(s1);
        }
        String[] ans=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
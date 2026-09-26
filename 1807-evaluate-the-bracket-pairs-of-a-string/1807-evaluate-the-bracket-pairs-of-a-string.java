class Solution{
    public String evaluate(String s,List<List<String>> knowledge){
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            String key="("+knowledge.get(i).get(0)+")";
            if(!map.containsKey(key)){
                map.put(key,knowledge.get(i).get(1));
            }
        }
        String alter="";
        boolean bstrt=false;
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                bstrt=true;
            }
            if(bstrt) a+=s.charAt(i);
            else alter+=s.charAt(i);
            if(s.charAt(i)==')'){
                if(map.containsKey(a)){
                    alter+=map.get(a);
                }
                else{
                    alter+="?";
                }
                a="";
                bstrt=false;
            }
        }
        return alter;
    }
}
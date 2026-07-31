class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int value:map.values()){
            list.add(value);
        }
        Collections.sort(list);
        int oprat=0;
        int cnt=0;
        for(int i=list.size()-1;i>=0;i--){
            cnt++;
            if(cnt<=8){
                oprat+=list.get(i);
            }else if(cnt<=16){
                oprat+=2*list.get(i);
            }else if(cnt<=24){
                oprat+=3*list.get(i);
            }else oprat+=4*list.get(i);
        }
        return oprat;
    }
}
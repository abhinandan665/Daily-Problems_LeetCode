class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> alist=new ArrayList<>();
        int am=1;
        for(int i=0;i<target.length;i++){
            while(am<target[i]){
                alist.add("Push");
                alist.add("Pop");
                am++;
            }
            if(target[i]==am){
                alist.add("Push");
            }
            am++;
        }
        return alist;
    }
}
class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=1;
        for(int i=1;i<=n;i++){
            if(i<10) map.put(i,1);
            else{
                int temp=i;
                int sum=0;
                while(temp>0){
                    sum+=temp%10;
                    temp/=10;
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
                max=Math.max(max,map.get(sum));
            }
        }
        int ans=0;
        for(int value:map.values()){
            if(value==max) ans++;
        }
        return ans;
    }
}
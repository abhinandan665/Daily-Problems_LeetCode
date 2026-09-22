class Solution {
    public boolean helper(int num){
        if(num<10 && num>0) return true;
        int temp=num;
        while(temp>0){
            int lastDigi=temp%10;
            if(lastDigi==0) return false;
            if(num%lastDigi!=0) return false;
            temp/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(helper(i)) ans.add(i);
        }
        return ans;
    }
}
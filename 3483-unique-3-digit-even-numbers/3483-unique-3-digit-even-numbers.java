class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]%2!=0) continue;
            for(int j=0;j<n;j++){
                if(j==i) continue;
                for(int k=0;k<n;k++){
                    if(k==j || k==i || digits[k]==0) continue;
                    int digi=(100*digits[k])+(10*digits[j])+digits[i];
                    set.add(digi);
                }
            }
        }
        return set.size();
    }
}
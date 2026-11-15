class Solution {
    public int pivotInteger(int n) {
        int l=1;
        int suml=0;
        int r=n;
        int sumr=0;
        while(l<=r){
            if(suml<sumr){
                suml+=l;
                l++;
            }
            else{
                sumr+=r;
                r--;
            }
        }
        r++;
        l--;
        if(suml+r==sumr) return r;
        else if(suml==sumr+l) return l;
        else return -1;
    }
}
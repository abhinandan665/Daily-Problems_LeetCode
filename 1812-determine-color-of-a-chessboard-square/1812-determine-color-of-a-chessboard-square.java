class Solution {
    public boolean squareIsWhite(String coordinates) {
        // if(coordinates.charAt(0)%2!=0){
        //     if(coordinates.charAt(1)!=0) return false;
        //     else return true;
        // }
        // else{
        //     if(coordinates.charAt(1)!=0) return true;
        //     else return false;
        // }
        int sum=coordinates.charAt(0)+coordinates.charAt(1);
        if(sum%2==0) return false;
        return true;
    }
}
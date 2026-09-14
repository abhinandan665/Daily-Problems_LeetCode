class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if((rec2[0]>rec1[0] && rec2[0]<rec1[2]) && (rec2[1]>rec1[1] && rec2[1]<rec1[3])){
            return true;
        }
        if((rec2[2]>rec1[0] && rec2[2]<rec1[2]) && (rec2[3]>rec1[1] && rec2[3]<rec1[3])){
            return true;
        }
        if((rec2[0]>=rec1[0] && rec2[2]<=rec1[2]) && (rec2[1]<=rec1[1] && rec2[3]>=rec1[3])){
            return true;
        }
        if((rec2[0]<=rec1[0] && rec2[2]>=rec1[2]) && (rec2[1]>=rec1[1] && rec2[3]<=rec1[3])){
            return true;
        }
        int r1tx=rec1[0];
        int r1ty=rec1[3];
        int r1bx=rec1[2];
        int r1by=rec1[1];

        int r2tx=rec2[0];
        int r2ty=rec2[3];
        int r2bx=rec2[2];
        int r2by=rec2[1];
        if((r1tx>r2tx && r1tx<r2bx) && (r1ty<r2ty && r1ty>r2by)) return true;
        if((r2tx>r1tx && r2tx<r1bx) && (r2ty<r1ty && r2ty>r1by)) return true;
        return false;
    }
}
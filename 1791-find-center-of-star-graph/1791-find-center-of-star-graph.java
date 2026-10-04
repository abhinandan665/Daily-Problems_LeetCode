class Solution {
    public int findCenter(int[][] edges) {
        int[] freq=new int[edges.length+2];
        for(int i=0;i<edges.length;i++){
            freq[edges[i][0]]++;
            if(freq[edges[i][0]]>1) return edges[i][0];
            freq[edges[i][1]]++;
            if(freq[edges[i][1]]>1) return edges[i][1];
        }
        return -1;
    }
}
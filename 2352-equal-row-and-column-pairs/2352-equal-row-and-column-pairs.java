class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        HashMap<List<Integer>,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                list.add(grid[i][j]);
            }
            map.put(list,map.getOrDefault(list,0)+1);
        }
        int ans=0;
        for(int j=0;j<n;j++){
            List<Integer> list1=new ArrayList<>();
            for(int i=0;i<n;i++){
                list1.add(grid[i][j]);
            }
            if(map.containsKey(list1)) ans+=map.get(list1);
        }
        return ans;
    }
}
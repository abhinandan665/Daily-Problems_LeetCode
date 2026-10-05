class Solution {
    public void dfs(int node,int[][] graph,List<Integer> list,int target,List<List<Integer>> ans){
        list.add(node);
        if(node==target){
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        for(int neighbour:graph[node]){
            dfs(neighbour,graph,list,target,ans);
        }
        list.remove(list.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dfs(0,graph,list,graph.length-1,ans);
        return ans;
    }
}
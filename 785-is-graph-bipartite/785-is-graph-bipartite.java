class Solution {
    int [] groups,adjList[];
    boolean completed[]; 
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        groups=new int[n];
        completed=new boolean[n];
        adjList=graph;
        for(int i=0;i<n;i++)
            if(!completed[i]&&!dfs(i,1))
               return false;
        return true;
    }
    boolean dfs(int i,int group)
    {
        if(groups[i]==group)
            return true;
        if(groups[i]==-group)
            return false;
        groups[i]=group; 
        completed[i]=true;
        for(int j:adjList[i])
        {
            if(!dfs(j,-group))
                return false;
        }
        return true;
    }
}
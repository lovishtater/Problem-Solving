class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n+1];
        for (int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList();
        }
        for (int i = 0; i< times.length; i++){
            int val = times[i][0];
            int ngh = times[i][1];
            int wt = times[i][2];
            graph[val].add(new Edge(val, ngh, wt));
            // graph[ngh].add(new Edge(ngh, val, wt));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparing(Pair::getTime));
        boolean visited[] = new boolean[n+1];
        
        pq.add(new Pair(k, 0));
        int max = -1;
        while(pq.size()>0){
            Pair rem = pq.poll();
            if(visited[rem.src]){
                continue;
            }else{
            visited[rem.src]=true;
            }
            max = Math.max(rem.time, max);
            for (int i = 0; i< graph[rem.src].size(); i++){
                Edge edge = graph[rem.src].get(i);
                if (!visited[edge.ngh]){
                    pq.add(new Pair (edge.ngh, rem.time + edge.wt));
                }
            }
        }
        for ( int i = 1  ; i < visited.length; i++){
            if (!visited[i]){
                return -1;
            }
        }
        return max;
    }
}

class Pair {
    int src; 
    int time;
    public Pair ( int src , int time){
        this.time = time;
        this.src = src;
    }
    public int getTime(){
        return time;
    }
}

class Edge {
    int val;
    int ngh;
    int wt;
    public Edge (int val, int ngh, int wt){
        this.val = val;
        this.wt = wt;
        this.ngh = ngh;
    }
}
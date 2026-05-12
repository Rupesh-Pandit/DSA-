import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFStraversal {
    public static class Edge {
        int src;
        int dst;
        int wt;

        Edge(int s, int d, int w) {
            this.dst = d;
            this.src = s;
            this.wt = w;
        }

        public static void creatGraph(ArrayList<Edge> graph[]) {

            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 1, 1));

            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));

            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));

            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));

            graph[6].add(new Edge(6, 5, 1));
        }
    }



    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr +" ");
        vis[curr]= true;

        for(int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dst])
                dfs(graph, e.dst, vis);
        }
    }
    
    public static void bfs(ArrayList<Edge>[] graph) {  // O(V+E ) Time complexity
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];

        q.add(1);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr +" ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                   if(!vis[e.dst])
                    q.add(e.dst);
                }
            }
        }
    }


    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        Edge.creatGraph(graph);
        bfs(graph);
        boolean siz [] = new boolean[graph.length];
        System.out.println();
        dfs(graph, 0, siz);
    }
}

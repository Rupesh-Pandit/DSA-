import java.util.ArrayList;

public class HashPath {

    public static class Edge {
        int src;
        int dst;
        int wt;

        Edge(int src, int dst, int wt) {
            this.dst = dst;
            this.src = src;
            this.wt = wt;

        }

        public static void createGraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));

            graph[1].add(new Edge(1, 3, 1));
            graph[1].add(new Edge(1, 0, 1));

            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 5, 1));
            graph[4].add(new Edge(4, 3, 1));

            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));

            graph[6].add(new Edge(6, 5, 1));

        }
    }

    public static boolean hasFound(ArrayList<Edge> graph[], int curr, boolean vis[], int key){
        if(curr == key){
            System.out.println("The key has found " + key);
            return true;
        }

        vis[curr] = true;

        for(int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dst]){

                if(hasFound(graph, e.dst, vis, key))
                    return true;
            }
        }
        return false;
       
    }

    public static void main(String[] args) {

        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        Edge.createGraph(graph);
        boolean vis[] = new boolean[graph.length];

        hasFound(graph, 0, vis, 5);
    }
}

package graph.bai1971;
import java.util.*;

public class FindIfPathExistsInGraph {
    public static void makeGraph(List<List<Integer>> adj, int n, int[][] edges) {
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];
        makeGraph(adj, n, edges);
        return isValid(adj, source, destination, visited);
    }

    public static boolean isValid(List<List<Integer>> adj, int source, int destination, boolean[] visited) {
        if (source == destination) {
            return true;
        } else {
            visited[source] = true;
            for (int e : adj.get(source)) {
                if (!visited[e] && isValid(adj, e, destination, visited)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0}
        };
        System.out.println(validPath(n, edges, 0, 2));
    }
}

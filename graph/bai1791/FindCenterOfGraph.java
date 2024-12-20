package graph.bai1791;

import java.util.HashMap;
import java.util.Map;

public class FindCenterOfGraph {
    public static int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[0].length; j++) {
                if (map.containsKey(edges[i][j])) {
                    map.put(edges[i][j], map.get(edges[i][j]) + 1);
                } else {
                    map.put(edges[i][j], 1);
                }
            }
        }
        int tsMax = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            tsMax = Math.max(tsMax, entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == tsMax) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] edges = {
                {1, 2},
                {2, 3},
                {4, 2}
        };
        System.out.println(findCenter(edges));

    }
}

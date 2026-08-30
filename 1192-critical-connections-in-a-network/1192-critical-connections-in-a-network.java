class Solution {

    int count = 0;

    public List<List<Integer>> criticalConnections(
            int n, List<List<Integer>> connections) {

        List<Integer>[] graph = new ArrayList[n];

        // Create graph
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges
        for (List<Integer> edge : connections) {

            int u = edge.get(0);
            int v = edge.get(1);

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] disc = new int[n];
        int[] low = new int[n];

        Arrays.fill(disc, -1);

        List<List<Integer>> ans = new ArrayList<>();

        dfs(graph, 0, -1, disc, low, ans);

        return ans;
    }

    public void dfs(
            List<Integer>[] graph,
            int curr,
            int parent,
            int[] disc,
            int[] low,
            List<List<Integer>> ans) {

        // Current node ne number aapo
        disc[curr] = count;
        low[curr] = count;
        count++;

        // Current node na neighbours
        for (int i = 0; i < graph[curr].size(); i++) {

            int next = graph[curr].get(i);

            // Parent ne ignore karo
            if (next == parent) {
                continue;
            }

            // Next node not visited
            if (disc[next] == -1) {

                dfs(
                    graph,
                    next,
                    curr,
                    disc,
                    low,
                    ans
                );

                // Child ni low value thi current update
                low[curr] = Math.min(
                    low[curr],
                    low[next]
                );

                // Bridge check
                if (low[next] > disc[curr]) {

                    ans.add(
                        Arrays.asList(curr, next)
                    );
                }

            } else {

                // Back edge
                low[curr] = Math.min(
                    low[curr],
                    disc[next]
                );
            }
        }
    }
}
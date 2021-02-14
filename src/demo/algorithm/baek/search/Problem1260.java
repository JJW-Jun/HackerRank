//package demo.algorithm.baek.search;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.stream.IntStream;
//
//public class Problem1260 {
//    private int m, n, start;
//    private static int vertex;
//    private static int[][] graph;
//    private static boolean[] visited;
//
//    Problem1260(int vertex) {
//        this.vertex = vertex;
//        this.graph = new int[m][n];
//        this.visited = new boolean[m];
//    }
//
//    void visitedInit() {
//        for (int i = 0; i < visited.length; i++) {
//            visited[i] = false;
//        }
//    }
//
//    void putElements(int x, int y) {
//        graph[x][y] = 1;
//    }
//
//    void printGraph() {
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(graph[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    void dfs(int start) {
//        visited[start] = true;
//        for (int p = 0; p < visited.length; p++) {
//            if (graph[start][p] == 1 && visited[p] == false) {
//                dfs(p);
//            }
//        }
//    }
//    public static void main(String args []) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        for (int i = 0; i < t; i++) {
//            s = br.readLine();
//            m = Integer.parseInt(str.split(" ")[0]);
//            n = Integer.parseInt(str.split(" ")[1]);
//            k = Integer.parseInt(str.split(" ")[2]);
//        }
//
//    }
//
//
//}

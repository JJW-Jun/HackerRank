package demo.study;

import java.util.*;

public class Bfs {
    static int n;
    static int[][] graph;
    static boolean[] visited;


    public static void bfs(int x) {
        Queue <Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;

        while(!q.isEmpty()) {
            x = q.poll();
            for(int i = 0; i < n; i++) {
                if(graph[x][i] == 1 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new int[n][n];
        visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        bfs(0);
    }
}
package demo.algorithm.baek.search;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1012 {

    static int m, n;
    static int k;
    static int[][] maps;
    static boolean[][] visited;
    static int result;

    // 동서남북
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int t = Integer.parseInt(str);

        for (int i = 0; i < t; i++) {
            str = br.readLine();
            m = Integer.parseInt(str.split(" ")[0]);
            n = Integer.parseInt(str.split(" ")[1]);
            k = Integer.parseInt(str.split(" ")[2]);

            maps = new int[m][n];
            visited = new boolean[m][n];
            result = 0;

            int x, y;
            for (int j = 0; j < k; j++) {
                str = br.readLine();
                x = Integer.parseInt(str.split(" ")[0]);
                y = Integer.parseInt(str.split(" ")[1]);
                maps[x][y] = 1;
            }

            for (int a = 0; a < m; a++) {
                for (int b = 0; b < n; b++) {
                    if (maps[a][b] == 1 && !visited[a][b]) {
                        result++;
                        visited[a][b] = true;
                        dfs(a, b);
                    }
                }
            }
            System.out.println(result);
        }
    }

    static void dfs(int x, int y) {
        int nx, ny;

        for (int i = 0; i < 4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }

}
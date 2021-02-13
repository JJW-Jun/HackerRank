package demo.algorithm.baek.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Problem2178 {
    // (dx,dy) : 우(0,1), 하(1,0), 좌(0,-1), 상(-1,0)
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static int n, m;
    public static int map[][];

    public static boolean visit[][];

    public static void bfs(int x, int y) {
        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();
        qx.add(x);
        qy.add(y);

        while (!qx.isEmpty() && !qy.isEmpty()) {
            x = qx.poll();
            y = qy.poll();
            visit[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int next_X = x + dx[i];
                int next_Y = y + dy[i];
                if (next_X >= 0 && next_Y >= 0 && next_X < n && next_Y < m) {
                    if (map[next_X][next_Y] == 1 && visit[next_X][next_Y] == false) {
                        qx.add(next_X);
                        qy.add(next_Y);
                        visit[next_X][next_Y] = true;
                        map[next_X][next_Y] = map[x][y] + 1; }}}}
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[100][100];
        visit = new boolean[100][100];
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = temp.charAt(j) - 48; // ASCII Code 48~57 (숫자) 문자를 숫자로 변환 } } bfs(0 , 0); // bf 시작 System.out.print(map[n-1][m-1]); } }
            }
        }
    }
}


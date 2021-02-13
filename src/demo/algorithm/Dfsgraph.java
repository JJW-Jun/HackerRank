package demo.algorithm;

import java.util.Arrays;

class DfsGraph {
    private int vertex;
    private int[][] dfsGraph;
    private boolean[] visit;

    // 그래프 초기화
    public DfsGraph(int vertex) {
        this.vertex = vertex;

        // 배열의 index는 0 부터 시작이기 때문에 size+1
        this.dfsGraph = new int[this.vertex+1][this.vertex+1];

        // 정점 방문 여부 확인 배열 초기화
        this.visit = new boolean[this.vertex+1];
    }

    // 그래프 return
    public int[][] getGraph() {
        return this.dfsGraph; }

    // 양방향 그래프
    public void put(int x, int y) {
        this.dfsGraph[x][y] = this.dfsGraph[y][x] = 1;}

    // 단방향 그래프
    public void putSingle(int x, int y) {
        this.dfsGraph[x][y] = 1;}

    // 그래프 출력 (인접행렬)
    public void printGraphToAdjArr() {
        for(int i=0; i<this.dfsGraph.length; i++) {
            for(int j=0; j<this.dfsGraph[i].length; j++) {
                System.out.print(" " + this.dfsGraph[i][j]);
            }
            System.out.println();
        }
    }

    // 방문 여부 확인 배열 초기화
    public void clearVisitArr() {
        for(int i=0; i<this.visit.length; i++) {
            this.visit[i] = false;
        }
    }

    // 그래프 탐색 (재귀호출)
    public void dfs(int vertex) {
        this.visit[vertex] = true;

        // 인접 행렬로 그래프에서 정점의 개수(nV)만큼 탐색
        for(int i=1; i<=this.vertex; i++) {
            // dfsGraph[][]의 해당 정점이 연결되어있는 것으로 표시되어 있으나 (연결은 1로 표시)
            // 방문 배열에서 방문하지 않은 상태(false)인 경우 재귀호출
            if(dfsGraph[vertex][i] == 1 && visit[i] == false) { dfs(i); }
        }
    }


}
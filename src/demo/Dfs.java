package demo;

import demo.customerdata.personaldata.CityGenerator;

import java.util.*;

public class Dfs {

    private int vertex;
    private int [][] graph;
    private boolean[] visited;


    public Dfs(int vertex){
        this.vertex = vertex;
        this.graph = new int[this.vertex+1][this.vertex+1];
        this.visited = new boolean[this.vertex+1];}

    // 양방향 추가
    public void bidirectionalPut(int x, int y){ this.graph[x][y] = this.graph[y][x]=1;}

    // 단방향 추가
    public void unidirectionalPut(int x, int y){ this.graph[x][y] =1;}

    // 그래프 출력 (1부터 시작)
    public void printGraph(){
        for(int i=1; i<this.graph.length;i++){
            for (int j=1; j<this.graph.length; j++){ System.out.print(" " + this.graph[i][j]); }
            System.out.println();
        }
    }

    // 방문 초기화
    public void clearVisited() {
        for (int i = 1; i < this.visited.length; i++) {
            this.visited[i] = false; }}

    // DFS
    public void searchDfs(int vertex) {
        this.visited[vertex] = true;

        System.out.println(vertex+ "탐색");
        for (int i = 1; i<=this.vertex; i++){
            System.out.println("---"+i);
            if (graph[vertex][i] ==1 && visited[i]==false){
                this.graph[vertex][i]=3;
                System.out.println("출력");
                printGraph();
                System.out.println(Arrays.toString(visited));
                searchDfs(i);
                }

        }}

    public static void main(String args[]) {
        CityGenerator cityGenerator = new CityGenerator();
        System.out.println(cityGenerator.randomCitySelect());

    }

}

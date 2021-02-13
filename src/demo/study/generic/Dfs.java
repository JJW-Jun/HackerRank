package demo.study.generic;

public class Dfs {
    private int vertices;
    private int [][] graph;
    private boolean [] visited;

    Dfs(int vertex){
        this.vertices = vertices;
        this.graph = new int [vertex+1][vertex+1];
        this.visited = new boolean [vertex+1];
    }


    public void printGraph(){
        for (int x=0; x<graph.length; x++){
            for (int y=0; y<graph.length; y++){
                System.out.print(graph[x][y]+" ");
            }
            System.out.println();
        }
    }


    public int[][] putBidirectional(int x, int y){
        graph[x][y] = graph[y][x] = 1;
        return graph;
    }


    public int[][] putOnewayDirectional(int x, int y){
        graph[x][y] = 1;
        return graph;
    }


    public void initGraph(){
        for(int x=0; x<graph.length;x++){
            for(int y=0; y<graph.length; y++){
                graph[x][y] = 0;
            }
        }
    }

    public void initVisited(){
        for (int i=0; i< visited.length; i++){
            visited[i]=false;
        }
    }


    public void doDfs(int vertex){
        visited[vertex] = true;
        for (int i=0; i< graph.length-1; i++){
            if(graph[vertex][i] == 1 && visited[i] == false) {
                doDfs(i);
            }

        }


    }


}

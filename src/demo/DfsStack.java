package demo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class DfsStack {

    static int[][] graph = new int[1001][1001];
    static boolean[] visitied = new boolean[1001]; //노드의 방문여부

    static int N, E, startPoint;

    static void dfs_stack(int startPoint){

        Stack<Integer> stack = new Stack();
        int pos = startPoint;
        visitied[startPoint]=true;
        stack.push(startPoint);

        while( !stack.isEmpty() ){

            boolean isConnection = false; //현재 위치에서 이동할 수 있는 곳이 있는지
            for(int i=1; i<=E; i++){

                if( graph[pos][i]==1 && visitied[i]==false){
                    pos=i;

                    stack.push(pos);
                    visitied[pos]=true;
                    isConnection = true;
                }
            }

            if( isConnection == false ){
                pos = stack.pop();
            }

        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //노드의 수
        E = sc.nextInt(); //간선의 수
        startPoint = sc.nextInt(); //시작지점;


        int v1, v2;
        for(int i=1; i<=E; i++){
            v1 = sc.nextInt();
            v2 = sc.nextInt();

            graph[v1][v2]=1;
            graph[v2][v1]=1;
        }

//        dfs_rec(startPoint); //재귀를 이용한 DFS
        dfs_stack(startPoint); //스텍을 이용한 DFS
        System.out.println(Arrays.asList(graph));
    }
}

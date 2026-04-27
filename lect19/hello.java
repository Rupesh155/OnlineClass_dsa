package lect19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


// import java.util.ArrayList;

// class graph{
//     int v;
//     ArrayList<ArrayList<Integer>> abj;

//     public graph(int v) {
//         this.v=v;
//         abj=new ArrayList<>();
//       //  har node ke liye empty list banegiii
//         for(int i =0;i<v;i++){
//             abj.add(new ArrayList<>());
        
//         }

//     }
//     void addEdge(int u,int v){
//         abj.get(u).add(v);
//         abj.get(v).add(u);

//     }
//     // [
//     //    [1,2]
//     //    ,[31,0] 
//     // ]
//     void printG(){
//         for(int i =0;i<v;i++){
//             System.out.print(i+ "->");
//             for(int  data: abj.get(i)){
//                 System.out.print(data+ "  ");

//             }
//             System.out.println();
//         }
//     }


// }
// public class hello {
//     public static void main(String[] args) {
//         graph g=new graph(5);
//         g.addEdge(0, 1);
//         g.addEdge(1, 2);
//         g.addEdge(0, 3);
//         g.addEdge(3, 4);

//         g.printG();

        
//     }
    
// }

class hello{
    static  void BFS(ArrayList<ArrayList<Integer>> graph,int start){
        boolean[] visited=new boolean[graph.size()];
        Queue<Integer> q=new LinkedList<Integer>() ;
        q.add(start);
        visited[start]=true;
        while (!q.isEmpty()) { 
            int node=q.poll();
            System.out.println(node);
            for(int nb:graph.get(node)){
                if(!visited[nb]){
                    visited[nb]=true;
                    q.add(nb);
                }

            }
            
        }




    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());

        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        BFS(graph,0);



        
    }
}
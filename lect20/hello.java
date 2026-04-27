package lect20;

import java.util.ArrayList;

class graph{
    int V;
    ArrayList<ArrayList<Integer>> abj;

    public graph(int V) {
        this.V=V;
        abj=new ArrayList<>();
        for(int i=0;i<V;i++){
            abj.add(new ArrayList<>());
        }

    }
    void addEdge(int u ,int v){
        abj.get(u).add(v);
        abj.get(v).add(u);

    }
    // dfs traversal

    boolean dfs(int currNode, int parent, boolean[] visited){
        visited[currNode]=true;
        System.out.println(currNode + " ");
        for(int nb : abj.get(currNode)){
            if(!visited[nb]){
                  if(dfs(nb, parent, visited)) ;
                  return true;
            }
            else if (currNode!=parent){
                return true;
            }
        }
        return  false;
       
    }
    
}

public class hello {
    public static void main(String[] args) {
        graph g=new graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        boolean[] visited=new boolean[5];
        g.dfs(0, visited);
   
    }
    
}

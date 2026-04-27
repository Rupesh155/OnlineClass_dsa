package lect18;

class Node{
    int v;
    int[][] graph;

    public Node(int v){
        this.v=v;
        graph=new int[v][v];

    }
   // edge add krne ke liye

        void addEdge(int u,int v){
            graph[u][v]=1;
            graph[v][u]=1;

        }
        //check connections

        void isConnected(int u,int v){
            if(graph[u][v]==1){
                System.out.println(u + " and" + v + "are conn..");
            } else{
                System.out.println(u + " and" + v + "are not  conn..");

            }

        }

        void printG(){
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    System.out.print(graph[i][j]+ "");
                }
                System.out.println();
            }
        }
}
class hello{
    public static void main(String[] args) {
        Node g=new Node(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.printG(); 
        g.isConnected(0, 2); 
        g.isConnected(1, 2); 

    }
}
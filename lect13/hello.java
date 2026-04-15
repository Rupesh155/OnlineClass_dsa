package lect13;
public class hello {
    static  int N=4;

    public  static  boolean  solve(int arr[][],int col){
        // if()
        for(int row=0;row<N;row++){
            if(isSafe(arr, row, col)){
                arr[row][col]=1;
                if(solve(arr, col+1)){
                    return  true;
                }
                arr[row][col]=0;
                

            }
        }
        return  false;

    }
    public static  boolean  isSafe(int arr[][],int row,int col){
        //left side row check ho rhab haiiii
        for(int i=0;i<col;i++){
            if(arr[row][i]==1){
                return false;
            }
        }
        //upper diagonal checkkkk
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(arr[i][j]==1){
                return  false;
            }
        }
        for(int i=row ,j=col;i<N && j>=0;i++,j--){
            if(arr[i][j]==1){
                return  false;
            }
        }
        return  true;


    }

    public  static  void printB(int ar[][]){

    }
    public static void main(String[] args) {
        int arr[][]=new int[N][N];
        if(solve(arr,0)){
            printB(arr);
        }else{
            System.out.println("No solution ");
        }

        
    }
    
}

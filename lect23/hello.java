package lect23;
// class hello{
//     public static void main(String[] args) {
//         int n=7;
//         int[] dp=new int[n+1];
//         //[0,1]
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         System.out.println(dp[n]);
//     }
// }

// class hello{
//     public static void main(String[] args) {
//         int[] cost={10,15,20};
//         int n=cost.length;
//         int[] dp=new int[n];
//         //base case
//         dp[0]=cost[0];
//         dp[1]=cost[1];
//         for(int i=2;i<n;i++){
//             dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
//         }
//         System.out.println(Math.min(dp[n-1],dp[n-2]));

//     }
// }


// class hello{
//     static  int solve(int arr[],int i){
//         if(i>=arr.length){
//             return 0;
//         }
//         int take=arr[i]+solve(arr,i+2);
//         int skip=solve(arr, i+1);
//         return  Math.max(take,skip);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,7,9,3,1};
//        int ans=   solve(arr,0);
//        System.out.println(ans);
//     }
// }


class hello{
    static  int houseR(int arr[]){
        int n=arr.length;
        if(n==1){
            return  arr[0];
        }
        int dp[]=new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            int take=arr[i]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(take,skip);
        
        }
        return  dp[n-1];
    }
    public static void main(String[] args) {
        int arr[]={2,7,9,3,1};
         int ans=  houseR(arr);
         System.out.println(ans);
    }
}
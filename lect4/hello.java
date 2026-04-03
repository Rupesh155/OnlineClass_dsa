package lect4;

// class hello{
//     public static void main(String[] args) {
//         int arr[]={1,2,3-2,4,5};
//         int k=3;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<=arr.length-k;i++){
//             int sum=0;
//             for(int j=i;j<i+k;i++){
//                 sum=sum+arr[j];

//             }
//             maxSum=Math.max(maxSum, sum);
//         }
//         System.out.println(maxSum);

//     }
// }

// class hello{
//     public static void main(String[] args) {
//         int arr[]={2,1,5,1,3,2};
//         int k=3;
//         int windoSum=0;
//         for(int i=0;i<k;i++){
//             windoSum+=arr[i];
//         }
//         int maxSum=windoSum;
//         for(int i=k;i<arr.length;i++){
//             windoSum=windoSum+arr[i]-arr[i-k];
//             maxSum=Math.max(maxSum, windoSum);

//         }
//         System.out.println(maxSum);


//     }
// }




class hello{
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int maxArea=0;
        for(int i =0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int w=j-i;
                int h=Math.min(height[i], height[j]);
                int area=w*h;
                maxArea=Math.max(maxArea, area);

            }
        }
        System.out.println(maxArea);

    }
}
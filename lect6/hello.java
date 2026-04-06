package lect6;
// public class hello {
//     public static int linearSearch(int arr[],int key){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key){
//                 return i;
//             }

//         }
//         return  -1;
//     }
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         int key=70;
//            int res= linearSearch(arr,key);
//            if(res!=-1){
//             System.out.println(res);
//            }else{
//             System.out.println("element not found");
//            }

//     }
// }

//o(log8)


// class hello{
//     public static int binarySearch(int arr[],int key){
//         int low=0;
//         int high=arr.length-1;
//         while (low<=high) {
//              int mid=(high+low)/2;
//              if(arr[mid]==key){
//                 return  mid;
//              }
//              else if(arr[mid]<key){
//                 low=mid+1;

//              }
//              else{
//                 high=mid-1;

//              }

            
//         }
//         return  -1;

//     }
//     //nlogn
//     public static void main(String[] args) {
//                 int arr[]={10,20,30,40,50};
//                 int key=20;
//             int res=    binarySearch(arr,key);
//             System.out.println(res);    
//     }
// }
      
// class hello{
//     public static void bubbleSort(int arr[]){
//         int n=arr.length;
//         for(int  i=0;i<n-1;i++){
//             for(int j=0;j<n-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }

//             }

//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={5,2,9,1,6};
//         bubbleSort(arr);
//         for(int num:arr){
//             System.out.println(num);
//         }
//     }
// }

// class hello{
//     public static void main(String[] args) {
//         for(int i =0;i<n;i++){
//             for(int j=i;j<=i;j++){
//                 for(int k=j;k<=j;k++){

//                 }
//             }
//         }
//     }
// }
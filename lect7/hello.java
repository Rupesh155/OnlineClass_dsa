package lect7;
// public class hello {
//     public  static  void sum(int n){
//         // System.out.println("hello");
//         if(n==0){
//             return;
//         }
    
//         System.out.println(n);
//         sum(n-1);
   
    
//     }
//     public static void main(String[] args) {
//         int n=5;
//         sum(n);
         
//     }
    
// }

//[1,3,2,4,5,6]
class hello{
    public static  void merg(int arr[],int low,int mid,int h){
        int temp[]=new int[h-low+1];
        int i=low;
        int j=mid+1;
        int  k=0;
        while (i<=mid && j<=h) { 
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }

            
        }
        while (i<=mid) {
            temp[k++]=arr[i++]; 
            
        }
        while (j<=h) {
            temp[k++]=arr[j++]; 
            
        }
        for(int x=0;x<temp.length;x++){
            arr[low+x]=temp[x];
        }


    }


    public static void mergeSort(int arr[],int low,int h) {
        if(low>=h){
            return;
        }
        int mid=(low+h)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, h);
        merg(arr,low,mid,h);
    
    }
    public static void main(String[] args) {
        int arr[]={5,3,9,1,6};
        mergeSort(arr,0,arr.length-1);
        for(int x: arr){
            System.out.println(x);
        }

        
    }
}
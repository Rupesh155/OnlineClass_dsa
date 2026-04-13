package lect8;

import java.util.HashMap;


//     public static void main(String[] args) {
//         HashMap<String,Integer> map=new HashMap<>();
//         map.put("om", 100);
//         map.put("ajay", 101);
//         System.out.println(map);
//         // System.out.println(map.get("omm"));
//         System.out.println(map.getOrDefault("omm",0));
//         // System.out.println(map.remove("om"));
//         System.out.println(map);
//         // for(String key :map.keySet()){
//         //     System.out.println(map.get(key));
//         // }
//         System.out.println(map.containsKey("om"));

        
//     }
  
// }

// import java.util.HashMap;

// class hello{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,1,1,4};
//         // 1->3
//         // 2->1
//         HashMap<Integer,Integer> freq=new HashMap<>();
//         for(int num : arr){
//             if(freq.containsKey(num)){
//                 freq.put(num,freq.get(num)+1);

//             }else{
//                 freq.put(num, 1)
//             }
//         }
//         System.out.println(freq);



        
//     }
// }

// import java.util.HashMap;

// class hello{
//     public static void main(String[] args) {
//         String str="aaabbcde";
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char ch : str.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0)+1);

//         }
//         for(char ch : str.toCharArray()){
//             if(map.get(ch)==1){
//                 System.out.println(ch);
//                  break;
//             }
//         }



//     }
// }

//two sum


// class hello{
//     public static void main(String[] args) {
//         int arr[]={2,7,11,15};
//         int target=9;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             int diff=target-arr[i];
//             if(map.containsKey(diff)){
//                 System.out.println(map.get(diff)+  " "+i);
//             }
//             map.put(arr[i], i);
//         }

//     }
// }
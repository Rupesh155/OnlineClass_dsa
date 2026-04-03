package lect5;


// public class hello {
//     public static void main(String[] args) {
//         String str="hello";

//         // StringBuilder str=new StringBuilder("hello");
//         // str.append("world");
//         // System.out.println(str);
//         // String s1="hello";
//         // String s2="hello";
//         // System.out.println(s2==s1);
//         //   String s="madam";
//         // String rev="";
//         // for(int i=s.length()-1;i>=0;i--){
//         //     rev=rev+s.charAt(i);

//         // }
//         // if(s.equals(rev)){
//         //     System.out.println("Palindrom");
//         // }
//         // else{
//         //     System.out.println("nhii haiii!!");
//         // }
//         // System.out.println(rev);




//         // Scanner sc=new Scanner(System.in);
//         // // String s1=sc.next();
//         // // System.out.println(s1);
//         // String s1=sc.nextLine();
//         // System.out.println(s1);
//         // String str="hello";
//         // for(int i=0;i<str.length();i++){
//         //     System.out.println(str.charAt(i));
//         // }
//         // System.out.println(str.length());
//         // System.out.println(str.charAt(0));
//         // System.out.println(str.subSequence(0, 3));
//         // System.out.println(str.toLowerCase());
//         // System.out.println(str.concat("hiii"));
//         // System.out.println(str);
//        // String str1=new String("hello");
//         // System.out.println(str);


//     }
    
// }



class hello{
    public static void main(String[] args) {
        String s1="hello";
        for(int i =0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int count =0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)==ch);
                count++;
            }
            if(count==1){
                System.out.println(ch);
                break;
            }
        }
    }
}

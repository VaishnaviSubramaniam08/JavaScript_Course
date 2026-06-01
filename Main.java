//     public static int minsum(int[] a, int[] b) {
//         Arrays.sort(a);
//         Arrays.sort(b);
//         int n = a.length;
//         int sum = 0;
//         for (int i=0;i<n;i++) {
//             sum+=a[i]*b[n-1-i];
//         }
//       return sum;
//     }
// public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         int[] b=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             b[i]=sc.nextInt();
//         }

//         System.out.println(minsum(a, b));
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//          int count=0;
//         for(int i=1;i<n;i++){
//             if(a[i]%2==0 && a[i-1]%2!=0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         Arrays.sort(a);
//         int sum=0;
//         int left=0;
//         int right=n-1;
//         while(left<right){
//             int temp=a[left];
//             a[left]=a[right];
//             a[right]=temp;
//             left++;
//             right--;    
//         }
//         for(int i=0;i<n;i++){
//              if((i+1)%k==0){
//                 continue;
//              }
//              sum+=a[i];
//         }
//         System.out.println(sum);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         String s1 ="hello";
//         String s2 ="world";
//         Set<Character> set = new HashSet<>();
//         for(char ch:s1.toCharArray()) {
//             set.add(ch);
//         }
//         for(char ch : s2.toCharArray()) {
//             set.add(ch);
//         }
//         System.out.println(set.size());
//     }
// }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(map.containsKey(a[i])){
//                 map.put(a[i],map.get(a[i])+1);
//             }
//             else{
//                 map.put(a[i],1);
//             }
//         }

//         int sum=0;
//         for(int i=0;i<n;i++){
//             if(map.get(a[i])==1){
//                 sum+=a[i];
//             }
//         }
//         System.out.println(sum);

//     }
// }
//rotate array right by 2

// import java.util.*;
// public class Main{
//      public static void rotatearray(int i,int j,int[] a){
//             while(i<j){
//                 int temp=a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//                 i++;
//                 j--;
//             }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         int k=sc.nextInt();
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         rotatearray(0,n-1,a);
//         rotatearray(0,k-1,a);
//         rotatearray(k,n-1,a);
//          for(int i=0;i<n;i++){
//             System.out.print(a[i]+" ");
//          }

//     }
// }

// //BMI VALUE 
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         int[] height=new int[n];
//         int[] weight=new int[n];
//         for(int i=0;i<n;i++){
//             height[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             weight[i]=sc.nextInt();
//         }
//         int count=0;
//         for(int i=0;i<n;i++){
//           int bmi=(weight[i]/height[i])*10;
//             System.out.println(bmi);
//             if(bmi<=k){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         int oddcount=0;
//         int evencount=0;
//         for(int i=0;i<n;i++){
//             if(a[i]%2==0){
//                 evencount++;
//             }else{
//                 oddcount++;
//             }
//         }
//         System.out.println(Math.min(evencount,oddcount)*2);
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int x=sc.nextInt();
//         int[] a=new int[n];
//         int[] b=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=i+1;
//         }
//         for(int i=0;i<n-1;i++){
//             b[i]=a[i]+a[i+1];
//         }
//         b[n-1]=a[n-1]+a[0];
//         for(int i=0;i<n;i++){
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//          for(int i=0;i<n;i++){
//             System.out.print(b[i]+" ");
//          }
//          System.out.println();
//          int count=0;
//          for(int i=0;i<n;i++){
//             if(b[i]%x==0){
//                 count++;
//             }
//          }
//          System.out.println(count);
//     }
// }

// import java.util.*;
// public class Main {
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int sqrt=(int)Math.sqrt(n);
//        int cube=(int)Math.cbrt(n);
//        int result=0;
//        result=(sqrt*sqrt)+(cube*cube*cube);
//        System.out.println(result);
//     }
// }
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[2*n];
        for(int i=0;i<n;i++){
            b[i]=a[i];
            b[i+n]=a[i];
        }
        for(int i=0;i<2*n;i++){
            System.out.print(b[i]+" ");
        }
    
    }
}
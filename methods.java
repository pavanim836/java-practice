                        //average of 3 numbers
/*import java.util.*;
public class lecture6 {
    public  static void average(int a,int b, int c){
        int avg=(a+b+c)/3;
        System.out.println("average of three numbers is: "+avg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average(a,b,c);


    }
    
}*/



                               //sum of oddd numbers
// import java.util.*;
// public class lecture6 {
//     public static void sumodd(int n){
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//         System.out.println("sum of odd numbers is:"+sum);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number:");
//         int n=sc.nextInt();
//         sumodd(n);
//     }
// }


                              //greater of 2 numbers
// import java.util.*;
// public class lecture6 {
//     public static void greater(int a,int b){
//         if(a>b){
//             System.out.println("a is greater");
//         }
//         else{
//             System.out.println("b is greater");
//         }
//         return;
//     }
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter two numbers:");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        greater(a,b);
//     }
// }


                                //circumference of circle
// import java.util.*;
// public class lecture6 {
//     public static void circum(int r){
//         float circum=2*3.14f*r;
//         System.out.println("circumference of circle is:"+circum);
//         return;

//     }
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the radius:");
//       int r=sc.nextInt();
//       circum(r);
//     }
// }


                               //voting eligibilty
// import java.util.*;
// public class lecture6 {
//     public static void vote(int age){
//         if(age>18){
//             System.out.println("eligible to vote");
//         }else{
//             System.out.println("not eligible to vote");
//         }
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the age:");
//         int age=sc.nextInt();
//         vote(age);
//         }
//     }

                            //count of pos,neg,zeroes

// import java.util.*;


// public class lecture6 {
//    public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();


//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }


//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }


//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }   
// }

                     //power of a number

// import java.util.*;
// public class lecture6{
//     public static void power(int x,int n){
//         int res=1,i;
//         for(i=0;i<n;i++){
//             res=res*x;

//         }
//         System.out.println("the result is:"+res);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number:");
//         int x=sc.nextInt();
//         System.out.println("enter the power:");
//         int n=sc.nextInt();
//         power(x,n);
//     }
// }


import java.util.*;
public class methods{
    public static void gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println("gcd is:"+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcd(a,b);


    }
}

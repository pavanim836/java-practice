import java.util.Scanner;

public class functions {
   // public static void printMyName(String name){
   //    System.out.println(name);
   //    return;
   // }
   // public static void main(String[] args) {
   //   Scanner sc = new Scanner(System.in);
   //   String name = sc.nextLine();
   //   printMyName(name);
   // } 

   // public static int add(int a, int b){
   //    int sum = a+b;
   //    return sum;
   // }
   // public static void main(String[] args) {
   //    Scanner sc = new Scanner(System.in);
   //    int a = sc.nextInt();
   //    int b = sc.nextInt();
   //    int sum = add(a,b);
   //    System.out.println("sum of two numbers is: "+sum);
   // }

   // public static int factorial(int n){
   //    int fact = 1;
   //    for(int i=n ; i>=1 ; i--){
   //       fact = fact*i;
   //    }
   //    return fact;

   // }
   // public static void main(String[] args) {
   //     Scanner sc = new Scanner(System.in);
   //     int n = sc.nextInt();
   //     int fact = factorial(n);
   //     System.out.println("factorial of the given number is: "+fact);
   // }


//    public static void factorial(int n){
//       int fact = 1;
//       for(int i=n ; i>=1 ; i--){
//          fact = fact*i;
//       }
//       System.out.println("factorial of the given number is: "+fact);
//       return;

//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        factorial(n);
//    }

      // public static int product(int a, int b){
      //    int pro = a*b;
      //    return pro;
      // }      
      // public static void main(String[] args) {
      //     Scanner sc = new Scanner(System.in);
      //     int a = sc.nextInt();
      //     int b = sc.nextInt();
      //     int pro = product(a,b);
      //     System.out.println("product of two numbers is "+pro); 
      // }

      public static void evenodd(int n){
         if(n%2==0){
            System.out.println("given number is even");
         } else{
            System.out.println("given number is odd");
         }
         return;
      }
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            evenodd(n);
         }
      }

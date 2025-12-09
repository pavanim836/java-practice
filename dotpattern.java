public class dotpattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // for(int i=1 ; i<=n ; i++){
        //     for(int j=1 ; j<=m ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // <------------output----------->
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        

        // for(int i=1 ; i<=n ; i++){
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
                // <------------output----------->
        // *  
        // * * 
        // * * * 
        // * * * *
        // * * * * *
        


        

        // for(int i=n ; i>=1 ; i--){
        //      for(int j=1 ; j<=i ; j++){
        //        System.out.print("* ");
        //       }
        //       System.out.println();
        //   }
        //<------------output----------->
        // * * * * *
        // * * * * 
        // * * * 
        // * * 
        // * 

        //  for(int i=n ; i>=1 ; i--){
        //      for(int j=1 ; j<=n-i ; j++){
        //          System.out.print(" ");
        //          }
        //          for(int j=1 ; j<=i ; j++){
        //              System.out.print("*");
        //          }
        //          System.out.println();
        //      }
        //<------------output----------->
        // * * * * *
        //   * * * * 
        //     * * * 
        //       * * 
        //         * 
        


        // for(int i=1 ; i<=n ; i++){
        //     for(int j=1 ; j<=n-i ; j++){
        //         System.out.print(" ");
        //         }
        //         for(int j=1 ; j<=i ; j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        //<------------output----------->
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *

        // for(int i=1 ; i<=n ; i++){
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(j);
        //         }
        //         System.out.println();
        //     }
        //<-------output---------------->
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        
        // for(int i=n ; i>=1 ; i--){
        //     for(int j=1 ; j<=i ; j++){
        //         System.out.print(j+" ");
        //         }
        //         System.out.println();
        //     }
        //<-------------output----------->
        //1 2 3 4 
        //1 2 3
        //1 2
        //1
        
        //int number=1;
        // for(int i=1 ; i<=n ; i++){
        //          for(int j=1 ; j<=i ; j++){
        //              System.out.print(number+" ");
        //              number++;
        //             }
        //             System.out.println();
        //          }
        //<-----------------output--------------->
        //  1 
        //  2 3
        //  4 5 6
        //  7 8 9 10 

       

        // for(int i=1 ; i<=n ; i++){
        //     for(int j=1 ; j<=i ; j++){
        //         int sum = i+j;
        //         if(sum%2==0){
        //         System.out.print("1 ");
        //         } else{
        //         System.out.print("0 ");
        //         }
        //        }
        //        System.out.println();
        //     }
        //<-------------output------------->
        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1


        
    }
}

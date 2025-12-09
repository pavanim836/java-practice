import java.util.*;
public class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int num[][]=new int[5][5];
        System.out.println("enter the elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("the elements are:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println("enter the element to be found:");
        // int x=sc.nextInt();
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(num[i][j]==x){
        //             System.out.println("element found at "+"("+i+","+j+")");
        //         }
        //     }
        //         }
                
            // System.out.println("transpose of matrix");
            
            //     for(int j=0;j<n;j++){
            //         for(int i=0;i<m;i++){
            //         System.out.print(num[i][j]+" ");
            //     }
            //      System.out.println();
            //     }
            
            



    
        }
}
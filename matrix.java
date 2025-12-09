import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("enter the number of columns:");
        int n = sc.nextInt();
        int array[][] = new int[m][n];

        System.out.println("enter the elements of the array:");
        for(int i=0 ; i<m; i++){
            for(int j=0 ; j<n ; j++){
                array[i][j] = sc.nextInt();
            }
        }

        // -------------printing ele of 2D array------------
        System.out.println("elements of the array are:");
        for(int i=0 ; i<m; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


        // <------------finding an ele in 2D array------------->
        // System.out.println("enter the number to be found:");
        // int x = sc.nextInt();
        
        // for(int i=0 ; i<m; i++){
        //     for(int j=0 ; j<n ; j++){
        //         if (array[i][j] == x) {
        //             System.out.print("element found at position: ("+i+","+j+")");
        //         }
        //     }
        // }


        // <--------------transpose of a matrix----------->
        System.out.println("transpose of matrix is:");
        for(int j=0 ; j<n; j++){
              for(int i=0 ; i<m ; i++){
                System.out.print(array[i][j]+" ");
        }
        System.out.println();
}

    }
}

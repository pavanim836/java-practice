import java.util.*;
public class array {
    public static void main(String[] args) {
        // int[] sub = new int[5];
        // sub[0] = 50;
        // sub[1] = 60;
        // sub[2] = 70;
        // sub[3] = 80;
        // sub[4] = 90;       --->method 1
        // int[] sub = (50 , 60, 70, 80, 80); -->method2
        // <----------------taking and printing array ele----------->
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of the array:");
        // int size = sc.nextInt();
        // int[] num = new int[5];
        // System.out.println("enter the elements of the array:");
        // for(int i=0 ; i<size ; i++){
        //     num[i] = sc.nextInt();
        // }
        // System.out.println("elements of the array are:");
        // for(int i=0 ; i<size ; i++){
        //     System.out.println(num[i]);
        // }
        //finding element in an array
        //     Scanner sc=new Scanner(System.in);
        //     System.out.println("enter the size of the array:");
        //     int size=sc.nextInt();
        //     int[] num=new int[10];
        //     System.out.println("enter the elemets of the array:");
        //     for(int i=0;i<size;i++){
        //         num[i]=sc.nextInt();
        //     }
        //     System.out.println("elemets of the array are:");
        //     for(int i=0;i<size;i++){
        //         System.out.println(num[i]);
        //     }
        //     System.out.println("enter the element to be found:");
        //     int x=sc.nextInt();
        //     for(int i=0;i<size;i++){
        //         if(num[i]==x){
        //             System.out.println("element found at index :"+i);
        //         }
        //     }
        // }
        // }
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        String[] name=new String[10];
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++){
            name[i]=sc.next();
        }
        System.out.println("elements of the array are:");
        for(int i=0;i<n;i++){
            System.out.println(name[i]);
        }
    }
}
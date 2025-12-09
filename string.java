
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String name=sc.nextLine();
        // System.out.println(name);  -------/reading and writing string

        // String name1=sc.nextLine();
        // String name2=sc.nextLine();
        // System.out.println(name1.equals(name2)); --------/comparision

        // String name1=sc.nextLine();
        // String name2=sc.nextLine();
        // System.out.println(name1+" "+name2); ---------/concatenation

        // String name1=sc.nextLine();
        // String name2=sc.nextLine();
        // if(name1.compareTo(name2)==0){
        //     System.out.println("strings are equal");
        // }
        // else{
        //     System.out.println("strings are not equal");------/comparing strings using compareTo

        // String name="tony stark";
        // System.out.println(name.length());---------/length of the string

        // String name="tony stark";
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));-------------/printing each ele in string
        // }

       
    //   int number = 123;
    //   String str = Integer.toString(number);
    //   System.out.println(str);---------/int to string 

    //   String str1="123";
    //   int num=Integer.parseInt(str);
    //   System.out.println(num);   ------------/string to int
      
    //   String ch="Tony Stark";
    //   System.out.println(ch.substring(6,10));--------/substring
      

    //<---------------username from email---------------->
    // System.out.println("enter your email:");
    // String Email=sc.next();
    // String username="";

    // username=Email.substring(0,Email.indexOf('@'));

//     for(int i=0;i<Email.length();i++){
//         if(Email.charAt(i)=='@'){
//             break;
//         }
//         else{
//             username+=Email.charAt(i);
//         }
//     }
//    System.out.println(username);


//<-----------------Reversing a string----------->
// System.out.println("enter a string:");
// String ch=sc.next();
// String rev="";
// for(int i=ch.length()-1;i>=0;i--){
//     System.out.print(ch.charAt(i));
// }---------->just to print reverse string
    //   for(int i=ch.length()-1;i>=0;i--){
    //       rev+=ch.charAt(i);
    //   }
    //    System.out.println(rev);----------->to reverse string in memeory


    //<---------------replacing e with i---------->
//     System.out.println("enter a string:");
// String ch=sc.next();
// String result="";

// for(int i=0;i<ch.length();i++){
//     if(ch.charAt(i)=='e'){
//         result+='i';
//     }
//     else{
//         result+=ch.charAt(i);
//     }
// }
// System.out.println(result);
    }
}

public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello world");
        System.out.println(sb);
        System.out.println(sb.length());//--------size of string 

        sb.append("!!!");
        System.out.println(sb);///---------adding elements at last

        sb.delete(11,14);
        System.out.println(sb);//--------deleteing elements in string

        System.out.println(sb.insert(0,'p'));//--------insert ele at particular index

        System.out.println(sb.replace(0,5,"hi"));//--------replace elements in string

        System.out.println(sb.charAt(4));//--------to get char at particular index

        System.out.println(sb.reverse());//--------reverse the string


        System.out.println(sb.toString());//--------convert stringbuilder to string

        System.out.println(sb.capacity());//--------capacity of stringbuilder
    }
}
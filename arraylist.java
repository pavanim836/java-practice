// import java.util.ArrayList;
// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<Integer>();
//         list.add(0);
//         list.add(1);
//         list.add(2);
//         list.add(3);

//         System.out.println(list);

//         System.out.println(list.size());

//         System.out.println(list.get(2));

//         list.add(0,4);
//         System.out.println(list);

//         list.set(1,6);
//         System.out.println(list);

//         System.out.println(list.contains(3));

//         list.remove(3);
//         System.out.println(list);
//         System.out.println(list.size());

//         for(int i=0;i<list.size();i++){
//             System.out.println(list.get(i));
//         }

//     }
// }


import java.util.ArrayList;
public class arraylist {
    static class Stack{
        
        static ArrayList<Integer> list = new ArrayList<Integer>();

        
        public boolean isEmpty(){
            return list.size() == 0;
        }
        
        public void push(int data){
            list.add(data);
            
                
        }
        
     
        public int pop(){
            if(isEmpty())
                return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
            
        }
        
        public int peek(){
            if(isEmpty())
                return -1;
            return list.get(list.size() - 1);
        }
        
        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(95);
        s.push(87);
        s.push(0);
        s.push(4);
        s.push(5);
        s.push(10);
        s.pop();
        s.pop();
    
         System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());

        
    }
}
import java.util.Stack;
public class SortAstack {
    static void sort(Stack<Integer>s){
        if(s.size()==0) return;
        int temp=s.pop();
        sort(s);
        insert(s,temp);


    }
    static void insert(Stack<Integer>s,int temp){
        if(s.isEmpty()|| s.peek()<=temp){
            s.push(temp);
            return;
        }
        int val=s.pop();
        insert(s,temp);
        s.push(val);

    }

   public static void main() {
        Stack<Integer>s=new Stack<>();
        s.push(4);
        s.push(8);
        s.push(9);
        s.push(10);
       System.out.println("original stack:"  +s);
       sort(s);
       System.out.println("sorted stack" +s);

    }


}
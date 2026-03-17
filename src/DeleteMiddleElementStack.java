import java.util.Stack;
public class DeleteMiddleElementStack {

    static void DelMid(Stack<Integer>s,int k,int size){
        if(k==size/2) {
            s.pop();
            return;

        }
        int temp=s.pop();
        DelMid(s,k+1,size);
        s.push(temp);




    }

   public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(9);
        s.push(3);
        s.push(10);
        s.push(5);
       System.out.println("Original Stack: " +s);
       int size=s.size();
       DelMid(s,0,size);
       System.out.println("After deleting middle:" +s);

    }
}
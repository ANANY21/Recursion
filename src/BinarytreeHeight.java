class Node{
    int data;
    Node left,right;
    Node(int val){
        data=val;
        left=right=null;

    }
}
public class BinarytreeHeight{
    static int height(Node root){
        if(root==null) {
            return 0;
        }
       int leftH=height(root.left);
        int rightH=height(root.right);
        return 1 + Math.max(leftH,rightH);

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("Height of tree" +height(root));

    }

}
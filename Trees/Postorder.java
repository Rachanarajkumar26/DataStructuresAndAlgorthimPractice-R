import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class Postorder {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Node root=createtrees(s);
        postorder(root);
    }
    public static Node createtrees(Scanner s)
    {
        int val=s.nextInt();
        Node root=new Node(val);
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            int leftval=s.nextInt();
            if(leftval!=-1)
            {
                curr.left=new Node(leftval);
                q.add(curr.left);
            }
            int rightval=s.nextInt();
            if(rightval!=-1)
            {
                curr.right=new Node(rightval);
                q.add(curr.right);
            }
        }
        return root;
    }

    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
}

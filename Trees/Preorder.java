import java.util.*;
class Node
{
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data=data;
        right=left=null;
    }
}
public class Preorder
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

         Node root=createtree(s);

         preorder(root);
    }

    public static void preorder(Node root)
    {
        if(root==null)return;

        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createtree(Scanner s)
    {
        int first=s.nextInt();
        Node root=new Node(first);
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
}
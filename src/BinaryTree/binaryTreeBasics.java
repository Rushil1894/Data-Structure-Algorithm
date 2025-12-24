package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binaryTreeBasics
{
    public static void main(String[] args)
    {
        Binarytree bt = new Binarytree();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
//        bt.root.right.right.left = new Node(80);
//        bt.root.right.right.right = new Node(90);

        /*
                                 10
                           20           30
                       40    50      60     70
         */
        // traversal types:-
//        // 1. Breath first search (a) level order traversal
//        bt.levelOrderTraversal(bt.root);
//
//
//        // 2. Depth first search (a) Pre order traversal (root left right)
//        bt.preOrderTraversal(bt.root);
//        System.out.println();
////        (b) in order traversal (left root right)
//        bt.inOrderTraversal(bt.root);
//        System.out.println();
////        (C) Post order traversal (left root right)
//        bt.postOrderTraversal(bt.root);
//        System.out.println();
//
//        //Count nodes in binary tree
//        System.out.println("Number of nodes: " + bt.count(bt.root));
//
//        //Find n-th node of inorder traversal
//        int k = 4;
//        System.out.print("n-th node of inorder: " );
//        int[] count = new int[1];
//        bt.nthNode(bt.root , k , count);
//        System.out.println();
//
//        //Find an element from Binary tree
//        int n  = 30;
//        System.out.println("element from Binary tree: " + bt.eleFromBinaryTree(bt.root ,n));
//
//        //Find the Maximum Depth /  Height of given Binary Tree
//        System.out.println("the Maximum Depth: " + bt.maxDepth(bt.root));
//
//        //Create binary tree from an array - level order fashion
//        int[] arr = {10,20,30,40,50,60,70,80};
//        bt.createBinaryTreeFromArr(arr);

        // ZigZag level order traversal
//        int[] flag = new int[1];
//        bt.zigZagLevelTraversal(bt.root );

        //pre-order Tree Traversal without Recursion
//        bt.preOrderTraversalNoRec(bt.root);

        //post-order Tree Traversal without Recursion
        bt.postOrderTraversalNoRec(bt.root);
    }

}

class Binarytree
{
    Node root;

    public int count(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    public void levelOrderTraversal(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
            }
        }
        System.out.println();
    }

    public void preOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }


    public void nthNode(Node root,int k , int[] count)
    {
        if(root == null)
        {
            return ;
        }

        nthNode(root.left,k ,count);
        count[0]++;
        if(count[0] == k)
        {
            System.out.print(root.data + " ");
        }
        nthNode(root.right,k,count);
    }

    public boolean eleFromBinaryTree(Node root ,int n)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == n)
        {
            return true;
        }
        return eleFromBinaryTree(root.left,n) || eleFromBinaryTree(root.right,n);
    }

    public int maxDepth(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public void createBinaryTreeFromArr(int[] arr)
    {
        root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i< arr.length)
        {
            Node n = q.poll();
            if(n != null ) {
                n.left = new Node(arr[i++]);
                q.add(n.left);
            }
            if(n != null && i< arr.length)
            {
                n.right = new Node(arr[i++]);
                q.add(n.right);
            }
        }

        levelOrderTraversal(root);

    }

    public void zigZagLevelTraversal(Node root )
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int flag = 0;
        while(!q.isEmpty())
        {
            int size = q.size();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++)
            {
                    Node n = q.poll();
                    if(flag == 0)
                    {
                        arr[i] = n.data;
                    }
                    else {
                        arr[size-1-i] = n.data;
                    }

                    if(n.left != null)
                    {
                        q.add(n.left);
                    }
                    if(n.right != null)
                    {
                        q.add(n.right);
                    }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

           if(flag == 0)
           {
               flag =1;
           }
           else {
               flag = 0;
           }

        }


    }


    public void preOrderTraversalNoRec(Node root)
    {
        Stack<Node> st = new Stack<>();
        st.add(root);
        while( !st.isEmpty())
        {
            Node n = st.pop();
            System.out.print(n.data + " ");
            if(n.right != null)
            {
                st.add(n.right);
            }
            if(n.left != null)
            {
                st.add(n.left);
            }
        }
    }

    public void postOrderTraversalNoRec(Node root)
    {
        
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
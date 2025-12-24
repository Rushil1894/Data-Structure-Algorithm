package Linked_list;

import java.util.ArrayList;
import java.util.Stack;

class Node
{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class Linklist
{
    int size = 0;
    Node head , tail ;


    public void addValue1(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head = tail = newnode;
            size++;
        }
        else {
            tail.next = newnode;
            tail = newnode;
            size++;
        }
    }

    public void addValue(int val , Node node)
    {
        Node newnode = new Node(val,node);
        if(head == null)
        {
            head =tail = newnode;
            size++;
        }
        else {
            tail.next = newnode;
            tail = newnode;
            size++;
        }
    }

    public void deleteValue(int delVal)
    {
        if(head == null )
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        if (head.val == delVal) {
            head = head.next;
            if (head == null)
            {
                tail = null;
            }
            size--;
            deleteValue(delVal);
            return;
        }

        Node temp = head;
        int flag = 0 ;
        while(temp.next != null)
        {
            if(temp.next.val == delVal )
            {
                if(temp.next == tail)
                {
                    temp.next = null;
                    tail = temp;
                    size--;
                    deleteValue(delVal);
                    flag =1;
                    return;
                }
                temp.next = temp.next.next;
                size--;
                deleteValue(delVal);
                flag =1;
              return;
            }

            temp = temp.next;
        }
        if(flag == 0)
        {
            System.out.println("Value not found...");
        }
    }

    public void update(int oldV , int newV)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.val == oldV)
            {
                temp.val = newV;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not present");
    }

    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void isEmpty()
    {
        if(head == null)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public void size ()
    {
        System.out.println(size);
    }

    public int countNode()
    {
        int count = 0;
        Node temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
//        System.out.println(count);
        return count;
    }

    public void reversePrint()
    {
        Stack<Integer> stack  = new Stack<>();
        Node temp = head;
        while(temp != null)
        {
            stack.push(temp.val);
            temp = temp.next;
        }

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }

    public void printNthnode(int k)
    {
        int count = 0 ;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            if(count == k )
            {
                System.out.println(temp.val);
                return;
            }
            temp = temp.next;
        }

    }

    public void printNthnodeFromLast(int k)
    {
        int size = countNode()+1;
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            count ++;
            if(count == (size-k))
            {
                System.out.println(temp.val);
                return;
            }
            temp = temp.next;
        }
    }

    public void deleteNode(Node node)
    {
        if(node == null || node.next == null)
        {
            System.out.println("Give valid node ");
            return;
        }
//        while(node.next.next != null)
//        {
//            node.data = node.next.data;
//            node = node.next;
//        }
//        node.data = node.next.data;
//        node.next = null;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public void printMiddleNode()
    {
        Node slow  = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }

    public void detectLoop()
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }

    public void countLengthofLoop()
    {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = 1;
                break;
            }
        }

        if(flag==1)
        {
            int count = 1;
            slow = slow.next;
            while(slow != fast)
            {
                slow = slow.next;
                count++;
            }
            System.out.println(count);
        }

    }

    public void removeDuplicateinSorted()
    {
        Node temp = head;
        while(temp != null)
        {
            Node temp2 = temp.next;
            while(temp2 != null && temp2.val == temp.val)
            {
                temp2 = temp2.next;
            }
            temp.next = temp2;
            temp = temp2;
        }
    }

    public void reverseLL()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node prev = null;
        Node temp = head;
        Node front = temp.next;
        while(temp.next != null)
        {
            temp.next = prev;
            prev = temp;
            temp  = front;
            front = temp.next;
        }
        temp.next = prev;
        head = temp;
    }

    public void removeElements(int val)
    {
        Node temp = head;
        while(temp.val == val)
        {
            head = head.next;
            temp = temp.next;
        }
        while(temp.next != null)
        {
            if(temp.next.val == val)
            {
                temp.next =temp.next.next;
                continue;
            }
            temp = temp.next;
        }
    }

    public void isPalindrome()
    {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size()-1;
        while(left <= right)
        {
            if(list.get(left) != list.get(right))
            {
                System.out.println("false");
                return;
            }
            left++;
            right--;
        }
        System.out.println("True");
    }
}



public class singlylinkedlist
{
    public static void main(String[] args)
    {
        Linklist LL = new Linklist();
        LL.addValue(10,null);
        LL.addValue(20,null);
        LL.addValue(30,null);
        LL.addValue(10,null);
//        LL.addValue(50,null);
//        LL.addValue(50,null);
//        LL.addValue(70,LL.head.next.next);

        LL.deleteValue(30);

//        LL.detectLoop();

//        LL.countLengthofLoop();

//        LL.removeDuplicateinSorted();

//        LL.reverseLL();

//        LL.removeElements(20);
        LL.isPalindrome();
        LL.print();
    }
}

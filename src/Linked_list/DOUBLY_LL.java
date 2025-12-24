package Linked_list;

import java.util.HashSet;
import java.util.Set;

class Node2
{
    int data;
    Node2 next , prev;

    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public Node2(int data, Node2 next, Node2 prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLL
{
    Node2 head,tail;

    public void insert(int val)
    {
        Node2 nn = new Node2(val);
        if(head == null)
        {
            head = tail =  nn;
        }
        else {
            tail.next = nn;
            nn.prev = tail;
            tail  = nn;
        }
    }

    public void print()
    {
        Node2 temp  = head;
        while(temp!=null)
        {
            System.out.print( temp.data +" ");
            temp = temp.next;
        }
    }

    public void printRev()
    {
        Node2 temp  = tail;
        while(temp!=null)
        {
            System.out.print( temp.data +" ");
            temp = temp.prev;
        }
    }

    public void delete(int val)
    {
        if(head == tail && head.data == val)
        {
            head = tail = null;
        }
        else if (tail.data == val)
        {
            tail =tail.prev;
            tail.next = null;
        }
        else if (head.data == val)
        {
            head = head.next;
            head.prev = null;
        }
        else
        {
            Node2 temp = head;
            while(temp != null && temp.data != val)
            {
                temp = temp.next;
            }
            if(temp == null)
            {
                System.out.println("Not found.");
                return;
            }
            Node2 pre = temp.prev;
            Node2 nex = temp.next;
            nex.prev = temp.prev;
            pre.next = temp.next;
        }
    }

    public void pairWithSum(int k)
    {
        Node2 left = head;
        Node2 right = tail;
        while(left != right)
        {
            if(left.data+right.data == k)
            {
                System.out.println("True");
                return;
            }
            else if(left.data+right.data > k)
            {
                right = right.prev;
            }
            else {
                left = left.next;
            }
        }
        System.out.println("False");
    }

    public void reverseDoublyLL()
    {
        Node2 temp = head;
        Node2 PREV = null;
        Node2 NEXT = temp.next;
        while(NEXT != null)
        {
            temp.next = PREV;
            temp.prev = NEXT;
            PREV = temp;
            temp = NEXT;
            NEXT = NEXT.next;
        }
        temp.next = PREV;
        temp.prev = NEXT;
        tail = head;
        head = temp;

    }

    public void insertInsertionSort(int val)
    {
        Node2 nn = new Node2(val);
        if(head == null)
        {
            head = tail = nn;
        }
        else
        {
            Node2 temp = head;
            while(temp!=null && !(temp.data > val))
            {
                temp = temp.next;
            }
            if(head.data > val)
            {
                Node2 PREV = temp.prev;
                nn.next = temp;
                nn.prev = PREV;
                temp.prev = nn;
                head = nn;
                return;
            }
            else if(temp == null)
            {
                insert(val);
                return;
            }
            Node2 PREV = temp.prev;
            nn.next = temp;
            nn.prev = PREV;
            PREV.next = nn;
            temp.prev = nn;

        }

    }


    public void removeDuplicateFromSorted()
    {
        Node2 temp = head;
        while(temp.next != null)
        {
            Node2 temp2 = temp.next;
            while(temp2.data == temp.data)
            {
                temp2 = temp2.next;
            }
            temp.next = temp2;
            temp2.prev = temp;
            temp  = temp2;
        }
    }

    public void deletePointer(Node2 point)
    {
        Node2 PREV = point.prev;
        Node2 NEXT = point.next;
        PREV.next = point.next;
        NEXT.prev = point.prev;
    }

    public void removeDuplicateFromNonSorted()
    {
        Node2 temp = head;
        while(temp != null)
        {
            Node2 temp2 = temp.prev;
            int flag = 0;
            while(temp2 != null )
            {
                if(temp2.data == temp.data)
                {
                    flag = 1;
                    break;
                }
                temp2 = temp2.prev;
            }
            if(flag==0)
            {
                temp = temp.next;
            }
            else{
                if(temp.next == null)
                {
                    Node2 PREV = temp.prev;
                    Node2 NEXT = temp.next;
                    PREV.next = temp.next;
                    tail = temp.prev;
                    temp = temp.next;
                }
                else {
                    Node2 PREV = temp.prev;
                    Node2 NEXT = temp.next;
                    PREV.next = temp.next;
                    NEXT.prev = temp.prev;
                    temp = temp.next;
                }
            }

        }
    }

    public void changeFirstAndLast()
    {
        Node2 temp = head;
        if(head == null || head.next==null)
        {
            head = head.next;
            return;
        }
        while(temp.next !=  head)
        {
            temp =temp.next;
        }
        Node2 PREV = temp.prev;
        temp.next = head.next;
        PREV.next = head;
        head.next = temp;
        head = temp;
    }

    public void CirDouPrint()
    {
        Node2 temp = head;
        while (temp.next != head)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void removeDuplicateFromNonSortedSinglyLL()
    {
        Node2 temp = head;
        while(temp != null)
        {
            Node2 temp2 = temp;
            while(temp2.next != null )
            {
                if(temp2.next.data == temp.data)
                {
                    temp2.next = temp2.next.next;
                    continue;
                }
                 temp2 =temp2.next;
            }
            temp = temp.next;
        }
    }
}

public class DOUBLY_LL
{
    public static void main(String[] args)
    {
        DoublyLL list = new DoublyLL();
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(10);
        list.insert(50);
        list.insert(20);
//        list.delete(30);

        list.print();
        System.out.println();
        list.printRev();
        System.out.println();

//        list.pairWithSum(600);

//        list.reverseDoublyLL();
//        list.print();
//        System.out.println();
//        list.printRev();

//        list.insertInsertionSort(10);
//        list.insertInsertionSort(20);
//        list.insertInsertionSort(30);
//        list.insertInsertionSort(40);
//        list.insertInsertionSort(5);
//        list.print();
//        System.out.println();
//        list.printRev();

//        list.removeDuplicateFromSorted();
//        list.print();
//        System.out.println();
//        list.printRev();

//        list.deletePointer(list.head.next.next);
//        list.print();
//        System.out.println();
//        list.printRev();

//        list.removeDuplicateFromNonSorted();
//        list.print();
//        System.out.println();
//        list.printRev();

//        list.removeDuplicateFromNonSortedSinglyLL();
//        list.print();


//        list.head.next.next.next.next.next.next=list.head;
//         list.changeFirstAndLast();
//         list.CirDouPrint();
    }
}

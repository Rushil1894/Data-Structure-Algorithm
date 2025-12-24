package Linked_list;

class Node1
{
    int val;
    Node1 next;

    public Node1(int val) {
        this.val = val;
        this.next = null;
    }

    public Node1(int val, Node1 next) {
        this.val = val;
        this.next = next;
    }
}

class CircularLL
{
    Node1 head;
    public void insert(int val)
    {
        Node1 nn = new Node1(val);
        if(head == null)
        {
            head = nn;
            nn.next = head;
        }
        else{
            Node1 temp = head;
            while(temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next=head;
        }
    }

    public void print()
    {
        Node1 temp = head;
        while(temp.next != head)
        {
            System.out.print( temp.val + " ");
            temp = temp.next;
        }
        System.out.println(temp.val);
    }


    public void isCircular()
    {
        Node1 slow  = head;
        Node1 fast = head;
        while(fast != null && fast.next!=null)
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

    public void changeFirstAndLast()
    {
        if(head.next == head || head.next.next== head)
        {
            head = head.next;
            return;
        }
        Node1 prev = null;
        Node1 temp = head;
        while(temp.next != head)
        {
            prev = temp;
            temp  = temp.next;
        }
        temp.next = head.next;
        prev.next = head;
        head.next = temp;
        head = temp;

    }
}


public class CIRCULAR_LL
{
    public static void main(String[] args)
    {
        CircularLL list = new CircularLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.print();

//        list.isCircular();

        list.changeFirstAndLast();

        list.print();

    }

}

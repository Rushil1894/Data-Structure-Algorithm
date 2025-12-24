package Linked_list;

// class Node are actually Built in singlylinkedlist

class leetCodeLL extends Linklist
{
    public void addTwoNumbers(Node l1, Node l2)
    {
        Node dummy = new Node(-1);
        Node res = dummy;
        Node temp1 = l1;
        Node temp2 = l2;
        int carry = 0;
        while(temp1 != null && temp2 != null)
        {
            int sum = temp1.val + temp2.val + carry;
            if(sum > 9)
            {
                int k = sum%10;
                Node nn = new Node(k);
                res.next = nn;
                res = res.next;
                carry = 1;
            }
            else{
                Node nn = new Node(sum);
                res.next = nn;
                res = res.next;
                carry = 0;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null)
        {
            int sum = temp1.val + carry;
            if(sum > 9)
            {
                int k = sum%10;
                Node nn = new Node(k);
                res.next = nn;
                res = res.next;
                carry = 1;
            }
            else{
                Node nn = new Node(sum);
                res.next = nn;
                res = res.next;
                carry = 0;
            }
            temp1 = temp1.next;
        }
        while(temp2 != null)
        {
            int sum = temp2.val + carry;
            if(sum > 9)
            {
                int k = sum%10;
                Node nn = new Node(k);
                res.next = nn;
                res = res.next;
                carry = 1;
            }
            else{
                Node nn = new Node(sum);
                res.next = nn;
                res = res.next;
                carry = 0;
            }
            temp2 = temp2.next;
        }
        if(carry == 1)
        {
            Node nn = new Node(1);
            res.next = nn;
        }
        head = dummy.next;
    }

    public void deleteDuplicates()
    {
        while(head != null && head.val == head.next.val)
        {
            head = head.next;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null)
        {
            Node temp2 = temp.next;
            int count = 0;
            while(temp2.next != null && temp2.val==temp.val)
            {
                count++;
                temp2= temp2.next;
            }
            if(count > 0)
            {
                prev.next = temp2;
                temp = temp2;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}
public class leetcodeHard
{
    public static void main(String[] args)
    {
        leetCodeLL LL1 = new leetCodeLL();
        LL1.addValue(1,null);
        LL1.addValue(1,null);
        LL1.addValue(1,null);
        LL1.addValue(2,null);
        LL1.addValue(3,null);
//        LL1.addValue(4,null);
//        LL1.addValue(5,null);

        leetCodeLL LL2 = new leetCodeLL();
        LL2.addValue(9,null);
        LL2.addValue(9,null);
        LL2.addValue(9,null);
        LL2.addValue(9,null);

//        LL1.addTwoNumbers(LL1.head,LL2.head);
        LL1.deleteDuplicates();
        LL1.print();
    }
}

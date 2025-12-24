package Hashing;

import java.util.HashMap;

class LRU_IMPLEMENT
{
    int capacity;
    int size = 0;
    linkedList ll = new linkedList();
    HashMap<Integer,Node2> hm = new HashMap<>();

    public LRU_IMPLEMENT(int capacity)
    {
        this.capacity = capacity;
    }

    public void add(int V)
    {
        if(!(hm.containsKey(V)))
        {
            if(size < capacity)
            {
                Node2 store = ll.insert(V);
                hm.put(store.data,store);
                size++;
            }
            else
            {
                Node2 temp = ll.head;
                int k = temp.data;
                ll.head = ll.head.next;
                if (ll.head != null)
                {
                    ll.head.prev = null;
                }
                hm.remove(k);
                Node2 store = ll.insert(V);
                hm.put(store.data, store);

            }
        }
        else
        {
            Node2 temp = hm.get(V);
            if (temp == ll.head)
            {
                ll.head = ll.head.next;
                if (ll.head != null) ll.head.prev = null;
            }
            else if (temp == ll.tail)
            {
                return;
            }
            else
            {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            Node2 store = ll.insert(V);
            hm.put(V, store);
        }
    }

    public void get(int V)
    {
        if(hm.containsKey(V))
        {
//            System.out.println("Present");
            Node2 temp = hm.get(V);

            if (temp == ll.head)
            {
                ll.head = ll.head.next;
                if (ll.head != null)
                {
                    ll.head.prev = null;
                }
            }
            else if (temp == ll.tail)
            {
                return;
            }
            else
            {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }

            Node2 store = ll.insert(V);
            hm.put(V, store);
        }
        else
        {
            add(V);
        }
    }

    public void print()
    {
        Node2 temp  = ll.tail;
        while(temp!=ll.head)
        {
            System.out.print( temp.data +" ");
            temp = temp.prev;
        }
        System.out.print(temp.data);
    }
}

class linkedList
{
    Node2 head ;
    Node2 tail ;

    public Node2 insert(int val)
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
        return nn;
    }
}

class Node2
{
    int data;
    Node2 next , prev;

    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class LRUimplementation
{
    public static void main(String[] args)
    {
        LRU_IMPLEMENT lruimp = new LRU_IMPLEMENT(3);
        lruimp.add(10);
        lruimp.add(20);
        lruimp.add(10);
        lruimp.get(40);
        lruimp.add(30);
        lruimp.get(50);
        lruimp.add(40);
        lruimp.get(30);
        lruimp.add(50);
        lruimp.add(40);
        lruimp.add(60);
        lruimp.add(50);

        lruimp.print();
    }
}

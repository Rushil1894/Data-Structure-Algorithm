package Hashing;

class Node
{
    int KEY;
    String VALUE;
    Node next;

    public Node(int KEY, String VALUE) {
        this.KEY = KEY;
        this.VALUE = VALUE;
        this.next = null;
    }
}


class Hashmap
{
    public int size = 16;
    public int Hmsize = 0;

    Node[] arr = new Node[size];

    public void put(int key, String val)
    {
        if (Hmsize >= (size * 0.75)) {
            resize();
        }
            Node nn = new Node(key,val);
            int bucketindex = getHashcode(key);
            if(arr[bucketindex] == null)
            {
                arr[bucketindex] = nn; //always this case happen so its give in O(1) TC;
                Hmsize++;
            }
            else
            {
                Node temp = arr[bucketindex];
                while(temp != null) //this is happened when collision is created so its give in O(n) TC;
                {
                    if(temp.KEY == key)
                    {
                        temp.VALUE = val;
                        return;
                    }
                    if(temp.next == null)
                    {
                        break;
                    }
                    temp = temp.next;
                }

                temp.next = nn;
                Hmsize++;
            }
    }

    private void resize()
    {
        size = size*2;
        Node[] newarr = new Node[size];
        for (int i = 0; i < arr.length ; i++) {
            Node temp2 = arr[i];

            while (temp2 != null) {
                int bucketindex = getHashcode(temp2.KEY);
                if (newarr[bucketindex] == null) {
                    newarr[bucketindex] =  new Node(temp2.KEY, temp2.VALUE);
                }
                else
                {
                    Node temp = newarr[bucketindex];
                    int flag = 0;
                    while(temp != null)
                    {
                        if(temp.KEY == temp2.KEY)
                        {
                            temp.VALUE = temp2.VALUE;
                            flag = 1;
                            break;
                        }
                        if(temp.next == null)
                        {
                            break;
                        }
                        temp = temp.next;
                    }
                    if(flag == 0)
                    {
                        temp.next = new Node(temp2.KEY, temp2.VALUE);
                    }
                }
                temp2 = temp2.next;
            }
        }
        arr = newarr;
    }

    public int getHashcode(int key)
    {
        return key % size;
    }

    public String get(int key)
    {
        int bucketindex = getHashcode(key);
        Node temp = arr[bucketindex];
        while(temp != null)
        {
            if(temp.KEY == key)
            {
                return temp.VALUE;
            }
            temp = temp.next;
        }
       return null;
    }

    public boolean contains(int key)
    {
        int bucketindex = getHashcode(key);
        Node temp = arr[bucketindex];
        while(temp != null)
        {
            if(temp.KEY == key)
            {
                return true;
            }
            temp = temp.next;
        }
      return false;
    }

    public int Size()
    {
        return Hmsize;
    }
}


public class HashMapImplementatiom
{
    public static void main(String[] args)
    {
        Hashmap hm = new Hashmap();
        hm.put(123,"abc");
        hm.put(456,"abc");
        hm.put(789,"ghi");
        hm.put(101,"jkl");
        hm.put(456,"def");
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");
        hm.put(5,"e");
        hm.put(6,"f");
        hm.put(7,"g");
        hm.put(8,"h");
        hm.put(9,"i");
        hm.put(0,"j");
        hm.put(10,"j");


        System.out.println(hm.get(456));
        System.out.println(hm.contains(456));
        System.out.println(hm.Size());
        System.out.println(hm.size);
    }
}


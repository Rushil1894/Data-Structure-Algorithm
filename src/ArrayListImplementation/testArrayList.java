package ArrayListImplementation;

public class testArrayList
{
    public static void main(String[] args)
    {
//        ArrayList<Integer> lis = new ArrayList<>();
//       lis.add(10);
//        lis.add(20);
//        lis.add(30);
//        System.out.println(lis.get(2));
//        lis.set(1,15);
//        lis.add(1,20);
//        System.out.println(lis);




        arrayList<Integer> list = new arrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        list.set(1,15);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove(2);
        list.print();
    }
}

class arrayList<T extends Number>
{
    int initialSize = 10;
    int curr = 0;
    T[] arr;


    arrayList()
    {
        arr = (T[]) new Object[initialSize];
    }

    public void add(T val)
    {
        arr[curr] = val;
        curr++;
    }


    public void print()
    {
        for (int i = 0; i < curr; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public void set(int ind, T nval)
    {
        if(ind < curr && 0 <= ind )
        {
            arr[ind] = nval;
        }
        else{
            System.out.println("Incorrect Index");
        }
    }

    public T get(int i)
    {
        if (i >= 0 && i < curr) {
            return arr[i];
        } else {
            System.out.println("Incorrect Index");
            return null;
        }
    }

    public int size()
    {
        return curr;
    }

    public void remove(int ind)
    {
        for(int i= ind; i<curr ; i++)
        {
            arr[i] = arr[i + 1];
        }
        curr--;
    }
}
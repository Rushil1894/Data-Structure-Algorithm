package STACKIMPLEMENT;
import java.util.ArrayList;


public class STACKFROMSCRATCH
{
    public static void main(String[] args)
    {
        STACKCLASS<Integer> st = new STACKCLASS<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
    }
}


//with array

//class STACKCLASS<T>
//{
//    int size = 0;
//    int initialcapacity = 5;
//    T[] dataarr ;
//
//
//    @SuppressWarnings("unchecked")//generally it is used to hide warning
//    public STACKCLASS() {
//        dataarr = (T[]) new Object[initialcapacity];//it is declared as object first and then type cast to that particular type
//    }
//
//    @SuppressWarnings("unchecked")
//    public void push(T value)
//    {
//        if(size == initialcapacity)
//        {
//            T[] newarr = (T[]) new Object[initialcapacity * 2];
//            for (int i = 0; i < size; i++) {
//                newarr[i] = dataarr[i];
//            }
//
//            dataarr = newarr;
//            initialcapacity  = initialcapacity*2;
//        }
//        dataarr[size]  = value;
//        size++;
//    }
//
//    public void pop()
//    {
//        if(size == 0)
//        {
//            System.out.println("STACK UNDERFLOW");
//            return;
//        }
//       size--;
//    }
//
//    public T  peek()
//    {
//        if(size == 0)
//        {
//            System.out.println("STACK IS EMPTY");
//            return null;
//        }
//        return dataarr[size-1];
//    }
//
//    public int size()
//    {
//        return size;
//    }
//
//    public boolean isEmpty()
//    {
//        if(size==0)
//        {
//            return true;
//        }
//        return false;
//    }
//}


//with arraylist
class STACKCLASS<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void push(T value) {
        data.add(value);
    }

    public void pop() {
        if (data.isEmpty()) {
            System.out.println("STACK UNDERFLOW");
        } else {
            data.remove(data.size() - 1);
        }
    }

    public T peek() {
        if (data.isEmpty()) {
            System.out.println("STACK IS EMPTY");
            return null;
        }
        return data.get(data.size() - 1);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}


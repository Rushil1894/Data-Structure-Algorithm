package STACKIMPLEMENT;

import java.util.Stack;

public class StackTuitionWork
{
    public static void main(String[] args)
    {
        String s = "hello good morning";
        String s2 = "rushil";

        //WITH HELP OF Scratch Stack implementation
//        STACK st  = new STACK();
//        char[] arr = new char[s.length()];
//
//        for (int i = 0; i < s.length(); i++)//o(2n) //o(n)
//        {
//
//            while(s.charAt(i) != ' ') {
//                st.push(arr, s.charAt(i));
//                if(i == s.length()-1)
//                {
//                    break;
//                }
//                i++;
//
//            }
//            while(!st.isempty())
//            {
//                st.peep(arr);
//                st.pop();
//            }
//            if(i != s.length()-1)
//            {
//                System.out.print(' ');
//            }
//
//        }


        //WITH THE HELP OF INBUILD STACK

        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
//        for (int i = 0; i < s.length(); i++)//o(2n) //o(n)
//        {
//
//            while(s.charAt(i) != ' ') {
//                stack.push( s.charAt(i));
//                if(i == s.length()-1)
//                {
//                    break;
//                }
//                i++;
//
//            }
//            while(!stack.isEmpty())
//            {
//                System.out.print(stack.peek());
//                stack.pop();
//            }
//            if(i != s.length()-1)
//            {
//                System.out.print(' ');
//            }
//
//        }

//        for(int i=0; i<s2.length(); i++)
//        {
//            stack.push(s2.charAt(i));
//        }
//        for (int i = 0; i < s2.length(); i++)
//        {
//            if(stack.peek() != s2.charAt(i))
//            {
//                System.out.println("NOT PALIN");
//                return;
//            }
//            stack.pop();
//        }
//        System.out.println("PALIN");


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int n  = stack.size();//o(2n)  //O(2n)
        while(stack.size() != (n/2))
        {
            stack2.push(stack.peek());
            stack.pop();
        }

        stack2.pop();

        while(!stack2.isEmpty())
        {
            stack.push(stack2.peek());
            stack2.pop();
        }

        System.out.println(stack);

    }
}









class STACK{
    int size = -1;


    public void push(char[] arr,char value)
    {
        if(size==arr.length-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        size++;
        arr[size] = value;
    }

    public void pop()
    {
        if(size == -1)
        {
            System.out.println("Stack underflow");
            return;
        }
        size--;
    }

    public void peek(char[] arr)
    {
        if(size == -1)
        {
            System.out.println("Stack is empty");
        }
        System.out.print(arr[size]);
    }

    public boolean isempty()
    {
        if (size == -1) {
            return true;
        }
        return false;

    }

    public void size()
    {
        System.out.println(size+1);
    }


}
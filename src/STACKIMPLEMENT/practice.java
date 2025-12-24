package STACKIMPLEMENT;

import java.util.Arrays;
import java.util.Stack;

public class practice
{
    public static void main(String[] args)
    {
        //question 1 getmin() with the help of extra space
//        minstack.push(30);
//        minstack.push(20);
//        minstack.push(40);
//        minstack.push(10);
//        minstack.pop();
//        minstack.getmin();
//        minstack.push(0);
//        minstack.push(11);
//        minstack.getmin();

        //Question 2 getmin() without the help of extra space

        //question 3 check string have valid parenthesis
//        String s= "(){}}{";
//        System.out.println(validParenthesis(s));

        //question 4  conversion of infix to postfix
//        String s = "a+b*(c+d-e)";
//        System.out.println(infixToPostfix(s));

        //question 5  conversion of infix to prefix
//        String s = "a+b*(c+d-e)";
//        System.out.println(infixToPrefix(s));

        //question 6  conversion of infix to prefix

        String s= "AB-DE+F*/";
        System.out.println(PostfixToInfix(s));

        //question 7
//        String s= "*+PQ-MN";
//        System.out.println(PrefixToInfix(s));

        //question 8
//        String s= "AB-DE+F*/";
//        System.out.println(PostfixToPrefix(s));

        //question 9
//        String s= "/-AB*+DEF";
//        System.out.println(PrefixToPostfix(s));

        //question 10
//        String s= "abbaca";
//        System.out.println(compressString(s));

        //question 11
//        TwoInOnestack.push1(10);
//        TwoInOnestack.push1(20);
//        TwoInOnestack.push2(10);
//        TwoInOnestack.push2(20);
//        TwoInOnestack.push1(30);
//        TwoInOnestack.push2(30);
//        TwoInOnestack.push1(40);
//        TwoInOnestack.push2(40);
//        TwoInOnestack.push1(50);
//        TwoInOnestack.push1(60);
//        TwoInOnestack.push1(70);
//        TwoInOnestack.pop1();
//        TwoInOnestack.pop2();
//        TwoInOnestack.peek1();
//        TwoInOnestack.peek2();

        //assign leetcode 2:
//        String s = "(()())(())";
//        System.out.println(removeOuterParentheses(s));

//        //Monotonic Stack Pattern (1) next smaller element
//        int[] arr = {10,8,11,2,5,3,8,13};
//        System.out.println(Arrays.toString(NextSmallestElement(arr)));

//        //Monotonic Stack Pattern (2) next greater element
//        int[] arr = {10,8,11,2,5,3,8,13};
//        System.out.println(Arrays.toString(NextGreaterElement(arr)));

//        //Monotonic Stack Pattern (3) previous smaller element
//        int[] arr = {10,8,11,2,5,3,8,13};
//        System.out.println(Arrays.toString(PreviousSmallestElement(arr)));

//        //Monotonic Stack Pattern (4) previous greater element
//        int[] arr = {10,8,11,2,5,3,8,13};
//        System.out.println(Arrays.toString(PreviousGreaterElement(arr)));

    }

    private static int[] PreviousGreaterElement(int[] arr)
    {
        int n  = arr.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <n; i++)
        {
            if(stack.isEmpty())
            {
                output[i] = -1;
                stack.push(arr[i]);
            }
            else if (arr[i]> stack.peek())
            {
                while(!stack.isEmpty() && arr[i] >= stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    output[i] = -1;
                }
                else {
                    output[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            else{
                output[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
        return output;
    }
    private static int[] PreviousSmallestElement(int[] arr)
    {
        int n  = arr.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <n; i++)
        {
            if(stack.isEmpty())
            {
                output[i] = -1;
                stack.push(arr[i]);
            }
            else if (arr[i]< stack.peek())
            {
                while(!stack.isEmpty() && arr[i] <= stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    output[i] = -1;
                }
                else {
                    output[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            else{
                output[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
        return output;
    }
    private static int[] NextGreaterElement(int[] arr)
    {
        int n  = arr.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >=0; i--)
        {
            if(stack.isEmpty())
            {
                output[i] = -1;
                stack.push(arr[i]);
            }
            else if (arr[i]> stack.peek())
            {
                while(!stack.isEmpty() && arr[i] >= stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    output[i] = -1;
                }
                else {
                    output[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            else{
                output[i] = stack.peek();
                stack.push(arr[i]);
            }
        }

        return output;
    }
    private static int[] NextSmallestElement(int[] arr)
    {
        int n  = arr.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >=0; i--)
        {
            if(stack.isEmpty())
            {
                output[i] = -1;
                stack.push(arr[i]);
            }
            else if (arr[i]< stack.peek())
            {
                while(!stack.isEmpty() && arr[i] <= stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    output[i] = -1;
                }
                else {
                    output[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            else{
                output[i] = stack.peek();
                stack.push(arr[i]);
            }
        }

        return output;
    }



    private static int prior(char c)
    {
        if(c=='^')
        {
            return 3;
        }
        else if(c == '*' || c=='/' || c=='%')
        {
            return 2;
        }
        else if(c == '+' || c=='-')
        {
            return 1;
        }
        else{
            return -1;
        }
    }
    private static String infixToPrefix(String s)
    {
        StringBuilder revstr = new StringBuilder();
        int n  = s.length();
        //reverse a string in revstr
        for (int i=n-1; i>=0; i--)
        {
            if(s.charAt(i)== '(')
            {
                revstr.append(')');
            }
            else if(s.charAt(i)== ')')
            {
                revstr.append('(');
            }
            else {
                revstr.append(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        //then perform postfix algo
        for (int i=0; i<n; i++)
        {
            if((revstr.charAt(i)>='a' && revstr.charAt(i)<='z') || (revstr.charAt(i)>='A' && revstr.charAt(i)<='Z') || (revstr.charAt(i)>='0' && revstr.charAt(i)<='9'))
            {
                ans.append(revstr.charAt(i));
            }
            else if (revstr.charAt(i)=='(')
            {
                stack.push(revstr.charAt(i));
            }
            else if (revstr.charAt(i)==')')
            {
                while(stack.peek()!='(')
                {
                    ans.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            }
            else
            {
                if(revstr.charAt(i)=='^')
                {
                    while(!stack.isEmpty() && prior(revstr.charAt(i))<=prior(stack.peek()))
                    {
                        ans.append(stack.peek());
                        stack.pop();
                    }
                }
                else {
                    while(!stack.isEmpty() && prior(revstr.charAt(i))<prior(stack.peek()))
                    {
                        ans.append(stack.peek());
                        stack.pop();
                    }
                }

                stack.push(revstr.charAt(i));
            }
        }
        while(!stack.isEmpty())
        {
            ans.append(stack.peek());
            stack.pop();
        }

        //then again reverse the revstr to ans
        //and final return the ans a prefix coversion
        ans.reverse();
        return ans.toString();
    }
    private static String infixToPostfix(String s)
    {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int n = s.length();
        for (int i=0; i<n; i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                ans.append(s.charAt(i));
            }
            else if (s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i)==')')
            {
                while(stack.peek()!='(')
                {
                    ans.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && prior(s.charAt(i))<=prior(stack.peek()))
                {
                    ans.append(stack.peek());
                    stack.pop();
                }
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty())
        {
            ans.append(stack.peek());
            stack.pop();
        }
        return ans.toString();
    }
    private static String PostfixToInfix(String s)
    {
        int n  = s.length();
        Stack<String> stack = new Stack<>();

        for (int i=0; i<n; i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
               stack.push(String.valueOf(s.charAt(i)));
            }
            else
            {
                String first = stack.peek();
                stack.pop();
                String second  = stack.peek();
                stack.pop();

                StringBuilder ans = new StringBuilder();
                ans.append('(').append(second).append(s.charAt(i)).append(first).append(')');
                stack.push(ans.toString());
            }


        }
        return stack.peek();
    }
    private static String PrefixToInfix(String s)
    {
        Stack<String> stack = new Stack<>();

        int n = s.length();
        for (int i=n-1; i>=0; i--)
        {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                stack.push(String.valueOf(s.charAt(i)));
            }
            else
            {
                String first = stack.peek();
                stack.pop();
                String second = stack.peek();
                stack.pop();

                StringBuilder ans = new StringBuilder();
                ans.append('(').append(first).append(s.charAt(i)).append(second).append(')');
                stack.push(ans.toString());
            }
        }
        return stack.peek();
    }
    private static String PostfixToPrefix(String s)
    {
        Stack<String> stack = new Stack<>();

        int n = s.length();
        for (int i=0; i<n; i++)
        {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                stack.push(String.valueOf(s.charAt(i)));
            }
            else
            {
                String first = stack.peek();
                stack.pop();
                String second = stack.peek();
                stack.pop();

                StringBuilder ans = new StringBuilder();
                ans.append(s.charAt(i)).append(second).append(first);
                stack.push(ans.toString());
            }
        }
        return stack.peek();
    }
    private static String PrefixToPostfix(String s)
    {
        Stack<String> stack = new Stack<>();
        int n = s.length();

        for (int i=n-1; i>=0; i--)
        {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                stack.push(String.valueOf(s.charAt(i)));
            }
            else
            {
                String first = stack.peek();
                stack.pop();
                String second = stack.peek();
                stack.pop();

                StringBuilder ans = new StringBuilder();
                ans.append(first).append(second).append(s.charAt(i));
                stack.push(ans.toString());
            }
        }
        return stack.peek();
    }



    public static boolean validParenthesis(String s)
    {
        Stack<Character> st = new Stack<Character>();
        int n  = s.length();
        for(int i=0; i<n; i++)
        {
//            if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
//            {
//                if(st.isEmpty())
//                {
//                    return false;
//                }
//            }

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty()) {return false;}

                if((s.charAt(i)==')' && st.peek() == '(') || (s.charAt(i)=='}' && st.peek() == '{') || (s.charAt(i)==']' && st.peek() == '['))
                {
                    st.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();

    }
    private static String compressString(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(stack.isEmpty())
            {
                stack.push(s.charAt(i));
            } else if (s.charAt(i)== stack.peek()) {
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.peek());
            stack.pop();
        }
        sb.reverse();
        return sb.toString();
    }


    public static String removeOuterParentheses(String s)
    {
        int start = 0;
        int n  = s.length();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb  = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }

            if(stack.isEmpty())
            {
                sb.append(s.substring(start+1,i));
                start = i+1;
            }
        }

        return sb.toString();
    }

}



class TwoInOnestack
{
    static int[] arr = new int[10];
    static int size1 = 0;
    static int size2 = arr.length-1;

    public static void push1(int value)
    {
        if(size1 <= size2)
        {
            arr[size1] = value;
            size1++;
        }
        else {
            System.out.println("Array is full");
        }
    }
    public static void push2(int value)
    {
        if(size1 <= size2)
        {
            arr[size2] = value;
            size2--;
        }
        else {
            System.out.println("Array is full");
        }
    }

    public static void pop1()
    {
            size1--;
    }
    public static void pop2()
    {
            size2++;
    }
    public static void peek1()
    {
        System.out.println(arr[--size1]);
        size1++;
    }
    public static void peek2()
    {
        System.out.println(arr[++size2]);
        size2--;
    }
}
class minstack
{

    static Stack<Integer> stack = new Stack<>();
   static Stack<Integer> temp = new Stack<>();

    public static void getmin()
    {
        System.out.println(temp.peek());
    }

    public static void push(int num)
    {
        if(stack.isEmpty())
        {
            stack.push(num);
            temp.push(num);
        }
        else if (num < temp.peek())
        {
            stack.push(num);
            temp.push(num);
        }
        else {
            stack.push(num);
        }
    }
    public static void pop()
    {
        if(stack.peek() == temp.peek())
        {
            stack.pop();
            temp.peek();
        }
        else {
            stack.pop();
        }
    }
}
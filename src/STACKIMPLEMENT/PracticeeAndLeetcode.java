package STACKIMPLEMENT;

import java.util.Stack;

public class PracticeeAndLeetcode
{
    public static void main(String[] args)
    {
       int[]  height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height)
    {
        int totalunit = 0;
        int n  = height.length;
        int[] pge = previousgreaterelement(height);
        int[] nge = nextgreaterelement(height);

        for (int i=0; i<n; i++)
        {
            if(nge[i] == -1 || pge[i]==-1)
            {
                continue;
            }
            else {
                int min = Math.min(nge[i],pge[i]);
                totalunit = totalunit + (min-height[i]);
            }
        }
        return totalunit ;
    }
    private static int[] previousgreaterelement(int[] height)
    {
        int n  = height.length;
        int[] output = new int[n];
        Stack<Integer> stack  = new Stack<>();
        int max = 0;

        for (int i=0; i<n; i++)
        {
            if(stack.isEmpty())
            {
                output[i] = -1;
                stack.push(height[i]);
                max = Math.max(max,height[i]);
            }
            else if (height[i] > stack.peek())
            {
                while(!stack.isEmpty() && height[i]>=stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    output[i] = -1;
                }
                else if(stack.peek() <= max)
                {
                    output[i] = max;
                }
                else {
                   output[i] =  stack.peek();
                    max = Math.max(max,height[i]);
                }
                max = Math.max(max,height[i]);
                stack.push(height[i]);
            }
            else {
                if(stack.peek() <= max)
                {
                    output[i] = max;
                }
                else {
                    stack.peek();
                    max = Math.max(max,height[i]);
                }
                stack.push(height[i]);
            }
        }
        return output;
    }
    public static int[] nextgreaterelement(int[] height)
    {
        int n  = height.length;
        int[] output = new int[n];
        Stack<Integer> stack  = new Stack<>();
        int max = 0;

        for (int i=n-1; i>=0; i--)
        {
            if(stack.isEmpty())
            {
                output[i] = -1;
                stack.push(height[i]);
                max = Math.max(max,height[i]);
            }
            else if (height[i] > stack.peek())
            {
                while(!stack.isEmpty() && height[i]>=stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    output[i] = -1;
                }
                else if(stack.peek() <= max)
                {
                    output[i] = max;
                }
                else {
                    output[i] =  stack.peek();
                    max = Math.max(max,height[i]);
                }
                max = Math.max(max,height[i]);
                stack.push(height[i]);
            }
            else {
                if(stack.peek() <= max)
                {
                    output[i] = max;
                }
                else {
                    stack.peek();
                    max = Math.max(max,height[i]);
                }
                stack.push(height[i]);
            }
        }
        return output;
    }

}

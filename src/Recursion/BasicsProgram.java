package Recursion;
//1. Infinite recursive function
//2. Calculate the factorial of a number without using loop
//3. Sum of 1 to n numbers without using loop
//4. Print the array elements without using loop
//5. Count the digits of a given number using recursion
//6. find the sum of digits of a number using recursion
//7. reverse an integer number using recursion
//8. calculate the product of two numbers using recursion
//9. get the largest element of an array using recursion
//10. check if a number is a prime number or not using recursion
//11. Print nth number in fibonacci number using recursion


public class BasicsProgram
{
    public static void main(String[] args)
    {
//        q1. Infinite recursive function
//        hello();

//        q2. Calculate the factorial of a number without using loop
//        int n = 5;
//        System.out.println( func2(n));

//        q3. Sum of 1 to n numbers without using loop
//        int n = 5;
//        System.out.println(func3(n));

//        q4. Print the array elements without using loop
//        int[] arr = {10,20,30,40,50,60,70};
//        func4(arr,0);

//        q5. Count the digits of a given number using recursion
//        int n = 12345;
//        System.out.println(func5(n));

//        q6. find the sum of digits of a number using recursion
//        int n  = 12345;
//        System.out.println(func6(n));

//        q7. reverse an integer number using recursion
//        int n = 12345;
//        System.out.println(func7(n , 0));

//        q8. calculate the product of two numbers using recursion
//        System.out.println(fumc8(5,8));

//        q9. get the largest element of an array using recursion
//        int[] arr  = {5,7,12,42,1,52,14,9};
//        System.out.println(func9(arr , 0, 0));

//        q10. check if a number is a prime number or not using recursion
//        int n  = 41;
//        System.out.println(func10(n ,2));

//        q11. Print nth number in fibonacci number using recursion
//        int n = 4;
//        System.out.println(func11(n));

    }



    private static void hello()
    {
        System.out.println("hello");
        hello();
    }

    private static int func2(int n)
    {
        if(n == 1)
        {
            return 1;
        }
         return n * func2(n-1);
    }

    private static int func3(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n + func3(n-1);
    }

    private static void func4(int[] arr,int idx)
    {
        if(idx == arr.length)
        {
            return;
        }
        System.out.print(arr[idx] + " ");
        func4(arr,idx+1);
//        System.out.print(arr[idx] + " ");//for in reverse like 70,60,50,50...
    }

    private static int func5(int n )
    {
        if(n == 0)
        {
            return 0;
        }
        return 1 + func5(n/10);
    }

    private static int func6(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        int cal = n%10;
        return cal + func6(n/10);
    }

    private static int func7(int n ,int sum)
    {
        if(n == 0)
        {
            return sum;
        }
        int cal = n%10;
        sum = (sum*10) + cal;
        return func7(n/10 ,sum);
    }

    private static int fumc8(int n, int m)
    {
        if(m == 0)
        {
            return 0;
        }
        return n + fumc8(n , m-1);
    }

    private static int func9(int[] arr , int idx ,int maxi)
    {
        if(idx == arr.length)
        {
            return maxi;
        }
        maxi = Math.max(maxi,arr[idx]);
        return func9(arr,idx+1,maxi);
    }

    private static boolean func10(int n , int i)
    {
        if(n == 1)
        {
            return false;
        }
        else if (n == 2) return true;
        else if (n % i == 0) {
            return  false;
        } else if (i == n-1 ) {
            return true;
        } else {
            return func10(n , i+1);
        }
    }

    private static int func11(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return func11(n-1) + func11(n-2);
    }
}

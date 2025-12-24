package Strings;

import java.util.*;

public class stringsAssignment
{
    public static void main(String[] args)
    {
        //. Declaration part

        String s1 = "hello Good Morning";
        String s2 = "hello Good Morning";
        String s3 =new String(" hello good morning   ") ;
        String s4 =new String("hello Good Morning") ;
        String s5 = "MADAM";
        String s6 = "rushel";
        String s7 = "helloeo";
        String s8 = "aabcd18989";
        String s9 = "madam eye nitin";
        String s10 = "abcdef";
        String s11 = "123456";
        String s12 = "abac";
        String s13 = "aabc";
        char[] s14 = {'1','2','3','4','5'};
        char[] s15 = {'6','7','8','9','0'};


        //. runnable part

//        q1(s1);
//        q2(s1);
//        q3(s5);
//        q4(s3);
//        q5(s3,s4);
//        q6(s6,'e','i');
//        q7(s6);
//        q8(s7);
//        q9(s6);
//        q10(s8);
//        q11(s3);
//        q12(s7);
//        q13(s6,s7);
//        q14(s9);
//        q15(s8);
        q16(s7);

        //extra from assignment

//        q17(s10,s11);
//        q18(s11);
//        q19(s12,s13);
//        q20(s6);
//        q21(s14,s15);

    }


    public static void q1(String s1)
    {
        //1. print in reverse order
        int n = s1.length();
        for (int i = n-1; i>=0; i--)
        {
            System.out.print(s1.charAt(i));
        }
    }

    public static void q2(String s1)
    {
        //.reverse a string in original string
        int n  = s1.length();
        char[] chars = s1.toCharArray();
        int left=0,right=n-1;
        while(left<right)
        {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--]= temp;
        }
        s1 = new String(chars);
        System.out.println(s1);

    }

    public static void q3(String s5 )
    {
        int n  = s5.length();
     //check is this string is a palindrome or not
        int left = 0,right =n-1;
        while(left<right)
        {
            if(s5.charAt(left++)!=s5.charAt(right--))
            {
                System.out.println("NOT PALINDROME");
                return;
            }
        }
        System.out.println("PALINDROME");
    }

    public static void q4(String s3 )
    {
        //count number of words in a String (with / without split function)
        int n  = s3.length();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if(s3.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void q5(String s3 , String s4)
    {
        // Program to check if two strings are same or not (without using inbuilt function .equals())
        int n  = s3.length();
        int m  = s4.length();
        if(n!=m)
        {
            System.out.println("NOT SAME");
            return;
        }

        for (int i = 0; i < n; i++)
        {
            if(s3.charAt(i)!=s4.charAt(i))
            {
                System.out.println("NOT SAME");
                return;
            }
        }
        System.out.println("SAME");

    }

    public static void q6(String s6, char oldchar , char newchar)
    {
        // Update a character in a string (without using .replace() function)
        int n = s6.length();
        char[] chars = s6.toCharArray();
        for (int i = 0; i < n; i++) {
            if(chars[i]==oldchar)
            {
                chars[i]=newchar;
            }
        }
        s6 = new String(chars);
        System.out.println(s6);

    }

    public static void q7(String s6 )
    {
        //7. Sort a string of lowercase
        int n = s6.length();
//        int[] arr = s6.codePoints().toArray();
//        long startTime = System.nanoTime();

        //approach 1
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        // convert int code point back to char
//        char[] chars = new char[n];
//        for (int i = 0; i < n; i++) {
//            chars[i] = (char) arr[i];
//        }
//        s6 = new String(chars);
//        System.out.println(s6);

//        long endTime = System.nanoTime();
//
//        // Calculate elapsed time in microseconds
//        long elapsedTime = (endTime - startTime) / 1000;
//        System.out.println("Time taken: " + elapsedTime + " microseconds");

        //approach 2
//        char[] chars = s6.toCharArray();
//        for (int i=0; i<n; i++)
//        {
//            int flag = 0;
//            int currcharval = chars[i]-'a';
//            int maxcharidx = -1;
//
//            for (int j=i; j<n; j++)
//            {
//                if((chars[j]-'a') < currcharval)
//                {
//                    currcharval = chars[j]-'a';
//                    maxcharidx = j;
//                    flag = 1;
//                }
//            }
//            if(flag==1)
//            {
//                char temp = chars[i];
//                chars[i] = chars[maxcharidx];
//                chars[maxcharidx]= temp;
//            }
//        }
//        s6 = new String(chars);
//        System.out.println(s6);

        //approach 3
        int[] alpha = new int[26];
        for (int i = 0; i < n; i++)
        {
            int index = s6.charAt(i)-'a';
            alpha[index]++;
        }
        char[] chars = new char[n];
        int j = 0;
        for(int i=0;i<alpha.length;i++)
        {
            if(alpha[i]==0)
            {
                continue;
            }
            while(alpha[i]!=0)
            {
                chars[j++] = (char)(i+'a') ;
                alpha[i]--;
            }
        }
        s6 = new String(chars);
        System.out.println(s6);
    }

    public static void q8(String s7 )
    {
        //8. Print frequency of all the characters in string
        int n  = s7.length();

        //approach 1
//        for (int i=0; i<n; i++)
//        {
//            int flag = 0;
//            int count = 0;
//            if(i>0)
//            {
//                for(int k = 0; k<=i-1; k++)
//                {
//                    if(s7.charAt(k) == s7.charAt(i))
//                    {
//                        flag =1;
//                        break;
//                    }
//                }
//            }
//
//            if(flag==1)
//            {
//                continue;
//            }
//
//            for (int j=i; j<n; j++)
//            {
//                if(s7.charAt(i)==s7.charAt(j))
//                {
//                    count++;
//                }
//            }
//            System.out.print(s7.charAt(i)+":"+count+" ");
//        }

        //approach 2
        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < s7.length(); i++)
        {
            char ch = s7.charAt(i);


            if (freqMap.containsKey(ch))
            {
                int current = freqMap.get(ch);
                freqMap.put(ch, current + 1);
            }
            else
            {
                freqMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.print(key + ":" + value + " ");
        }
    }

    public static void q9(String s6 )
    {
        //Remove Vowels from a String
        int n  = s6.length();
        char[] chars = s6.toCharArray();//o(n)
        char[] newchar = new char[n];
        int idx = 0;
         for (int i = 0; i < n; i++) {
            if(s6.charAt(i)=='a'|| s6.charAt(i)=='A'|| s6.charAt(i)=='e'|| s6.charAt(i)=='E'||
                    s6.charAt(i)=='i'|| s6.charAt(i)=='I'|| s6.charAt(i)=='O'|| s6.charAt(i)=='o'||
                    s6.charAt(i)=='u'|| s6.charAt(i)=='U')
            {
                continue;
            }
            else {
                newchar[idx++] = s6.charAt(i);
            }
        }
         s6 = new String(newchar,0,idx );
        System.out.println(s6);
    }

    public static void q10(String s8 )
    {
//        Remove All Digits
        int n  = s8.length();

        char[] chars = s8.toCharArray();//o(n)
        char[] wchar = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if(s8.charAt(i)>='0' && s8.charAt(i)<='9')
            {
                continue;
            }
            else {
                wchar[idx++] = s8.charAt(i);
            }
        }
        s8 = new String(wchar,0,idx );
        System.out.println(s8);

    }

    public static void q11(String s3 )
    {
        //Reverse Words internally in a String // eg. hello good morning -> olleh doog gninrom
        int n  = s3.length();
        if(n==0 || n==1)
        {
            System.out.println("String Are reverse itself");
            return;
        }

        //approach 1
        String[] words = s3.trim().split(" ");

        for (int i = 0; i < words.length; i++)
        {
           words[i] =  reverseword(words[i]);
        }
        s3 = "";
        for (int i = 0; i < words.length; i++) {
            s3   += words[i]+" ";
        }
        System.out.println(s3);
    }
    public static String reverseword(String word)
    {
        int  n = word.length();
        char[] chars = word.toCharArray();
        int left  = 0,right = n-1;
        while(left<right)
        {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        word = new String(chars);
        return word;

    }

    public static void q12(String s7 )
    {
        //find duplicate chars from string
        int n  = s7.length();

        //Approach 1
        int[] hash = new int[26];

        for(int i=0; i<n; i++)
        {
            if(s7.charAt(i)>='A' && s7.charAt(i)<='Z' || s7.charAt(i)>='a' && s7.charAt(i)<='z')
            {
                int index = s7.toLowerCase().charAt(i)-'a';
                hash[index]++;
            }
            else {
                continue;
            }
        }
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < hash.length; i++) {
            if(hash[i]==0 || hash[i]==1)
            {
                continue;
            }
            chars.add((char)(i+'a'));
        }

        System.out.println(chars);

    }

    public static void q13(String s6 , String s7)
    {
        //Merge two Strings of same length Alternatively
        int n  = s6.length();
        int m  = s7.length();

        if(n!=m)
        {
            System.out.println("string size are differnt ");
            return;
        }
        char[] chars = new char[n*2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            chars[j++] = s6.charAt(i);
            chars[j++] = s7.charAt(i);
        }
        String newstring = new String(chars);
        System.out.println(newstring);

    }

    public static void q14(String s9)
    {
        //TC: 0(n) SC: O(1)
        //Check if all words are palindrome // “madam eye nitin”
        int n = s9.length();
        int j = 0;
        for(int i=0; i<n; i++)
        {
            if(s9.charAt(i)==' ')
            {
                if(iswordpalindrome(s9,j,i-1))
                {
                    j = i+1;
                }
                else {
                    System.out.println("String is not palindrome");
                    return;
                }
            }
        }
        if (!iswordpalindrome(s9, j, n - 1))
        {
            System.out.println("String is not palindrome");
            return;
        }
        System.out.println("Plindrome");
    }
    public static boolean iswordpalindrome(String s9, int left,int right)
    {
        while(left<right)
        {
            if(s9.charAt(left++)!=s9.charAt(right--))
            {
                return false;
            }
        }
        return true;
    }

    public static void q15(String s8)
    {
        //Check if string have equal digits and chars // hello12387
        int n  = s8.length();
        int alphabet = 0;
        int digit = 0;
        for(int i=0; i<n; i++)
        {
            if(s8.charAt(i) < 'A')
            {
                digit++;
            }
            else {
                alphabet++;
            }
            /*
             if (Character.isDigit(ch)) {
                digit++;
            } else if (Character.isLetter(ch)) {
                 alphabet++;
            }
             */
        }
        if(digit!=alphabet)
        {
            System.out.println("NOT SAME");
        }
        else {
            System.out.println("SAME");
        }
    }

    public static void q16(String s7)
    {
        //Remove duplicate chars from string // helloeo -> helo
        int n = s7.length();

        int[] hash = new int[26];

        for(int i=0; i<n; i++)
        {
            if(s7.charAt(i)>='A' && s7.charAt(i)<='Z' || s7.charAt(i)>='a' && s7.charAt(i)<='z')
            {
                int index = s7.toLowerCase().charAt(i)-'a';
                hash[index]++;
            }
            else {
                continue;
            }
        }
        char[] chars = new char[n];
        int idx =0;
        for (int i = 0; i < n; i++) {
            int ascii = s7.charAt(i) - 'a';

            if(hash[ascii]>=1)
            {
                chars[idx++]  = ((char)(ascii+'a'));
                hash[ascii]=0;
            }
        }
//        System.out.println(chars);
        s7 = new String(chars,0,idx);
        System.out.println(s7);
    }

    private static void q17(String s10, String s11)
    {
        //1. Swap two strings of same size without using third string
        int n  = s10.length();
        int m  = s11.length();
        if(n!=m)
        {
            System.out.println("LENGTH ARE DIFFERENT");
            return;
        }
        char[] chars = new char[n*2];
        int j = 0;
        for (int i=0; i<n; i++)
        {
            chars[j++] = s10.charAt(i);
        }
        for (int i=0; i<n; i++)
        {
            chars[j++] = s11.charAt(i);
        }

        s10 = new String(chars,n,n);
        s11 = new String(chars,0,n);

        System.out.println(s10);
        System.out.println(s11);
    }

    private static void q18(String s11)
    {
        //2. Convert a string into an integer without using Integer.parseInt() function
        //TC O(n), ASC O(1)
        //Ex "123" -> 123.
        int n = s11.length();
        int number = 0;

        for(int i=0; i<n; i++)
        {
            int check = s11.charAt(i)-'0';
            if (check < 0 || check > 9) {
                System.out.println("Invalid input: contains non-digit characters.");
                return;
            }
            number  = (number*10)+check;
        }
        System.out.println(number);
    }

    private static void q19(String s12, String s13)
    {
        //3. Check if two strings are permuting each other or not?
        //TC O(n), ASC O(1)
        //Ex s1=”abac” s2=”aabc” -> true
        //s1=”abac” s2=”abc” -> false

        int n  = s12.length(),m=s13.length();
        if(n!=m)
        {
            System.out.println("NOT PERMUTING");
            return;
        }

        int[] hash = new int[26];
        int[] hash2 = new int[26];

        for (int i=0; i<n; i++)
        {
            hash[s12.charAt(i)-'a']++;
            hash2[s13.charAt(i)-'a']++;
        }

        for(int i=0; i< hash.length; i++)
        {
            if(hash[i] != hash2[i])
            {
                System.out.println("NOT PERMUTING");
                return;
            }
        }
        System.out.println("PERMUTING");
    }

    private static void q20(String s6)
    {
        int n  = s6.length();
        for (int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(s6.charAt(j)+" ");
            }
            System.out.println();
        }
    }

    private static void q21(char[] s14, char[] s15)
    {
        //5.Given two char array: {‘5’, ‘2’, ‘3’} and {‘1’, ‘6’, ‘2’}, sum both the string
        //Output: 685

        int n = s14.length;
        int m = s15.length;
        int number = 0;
        int number2 = 0;
        for(int i=0; i<n; i++)
        {
            int check = s14[i]-'0';
            number  = (number*10)+check;
        }
        for(int i=0; i<m; i++)
        {
            int check = s15[i]-'0';
            number2  = (number2*10)+check;
        }
        System.out.println(number+number2);

//        for(int i=0; i<n; i++)
//        {
//            int check = s11.charAt(i)-'0';
//            if (check < 0 || check > 9) {
//                System.out.println("Invalid input: contains non-digit characters.");
//                return;
//            }
//            number  = (number*10)+check;
//        }
//        System.out.println(number);


    }

}
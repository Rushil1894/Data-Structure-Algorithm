package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class tufleetcode {
    public static void main(String[] args) {
//        String s = "(()())(())";
//        System.out.println(removeOuterParentheses(s));

//        String num = "9";
//        System.out.println(largestOddNumber(num));

//       String  s = "foo";
//        String t = "bar";
//        System.out.println(isIsomorphic(s,t));

//        String s = "aa";
//        String goal = "a";
//        System.out.println(rotateString(s,goal));


//        String  s = "-91283472332";
//        System.out.println(myAtoi(s));

//        String  s = "MCMXCIV";
//        System.out.println( romanToInt(s) );

//        String s = "babad";
//        System.out.println(longestPalindrome(s));

//        String s =  "aabcbaa";
//        System.out.println(beautySum( s));

        String s = "()(())";
        System.out.println(longestValidParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        int[] hash = new int[128];
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int ascii = '(';
                hash[ascii]++;
                count++;
            } else if (s.charAt(i) == ')') {
                int ascii = ')';
                hash[ascii]++;
                count--;
            }

            if (count == 0) {
                int ascii = '(';
                int ascii2 = ')';
                String str = "()";
                if (hash[ascii] == hash[ascii2]) {
                    int n = hash[ascii];
                    while ((n - 1) > 0) {
                        sb.append(str);
                        n--;
                    }
                    hash[ascii] = 0;
                    hash[ascii2] = 0;
                }
            }
        }

        return sb.toString();
    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) > '0' && num.charAt(i) <= '9') {
                int n = num.charAt(i) - '0';
                if (n % 2 == 1) {
                    return num.substring(0, i + 1);
                }

            }
        }
        return "";

    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (mp.containsKey(schar)) {
                if (mp.get(schar) != tchar) {
                    return false;
                }
            } else {
                if (hs.contains(tchar)) {
                    return false;
                }
                mp.put(schar, tchar);
                hs.add(tchar);
            }
        }
        return true;
    }

    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (sb.toString().contains(goal)) {
            return true;
        }
        while (sb.length() <= goal.length()) {
            sb.append(s);
            if (sb.toString().contains(goal)) {
                return true;
            }
        }
        return false;
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int sign = 0;
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = 1;
            i = 1;
        } else if (s.charAt(0) == '+') {
            sign = 0;
            i = 1;
        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break;
            sb.append(ch);
            i++;
        }
        int digit = 0;
        for (int j = 0; j < sb.length(); j++) {
            int m = sb.charAt(j) - '0';

            if (digit > (Integer.MAX_VALUE - m) / 10) {
                return (sign == 1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            digit = (digit * 10) + m;
        }


        return (sign == 1) ? -digit : digit;

    }

    public static int romanToInt(String s)
    {
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int n = s.length();//inp:"MCMXCIV" out:1994
        int romannum = 0;

        romannum = romannum + mp.get(s.charAt(n-1));
        for (int i=n-2; i>=0; i--)
        {
            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i+1)))
            {
                romannum = romannum -  mp.get(s.charAt(i));
            }
            else{
                romannum += mp.get(s.charAt(i));
            }
        }


        return romannum;
    }

    public static String longestPalindrome(String s)
    {
        int start = 0;int end  = 0;int maxlen = 0;
        int n = s.length();//babad//bab
        for(int i =0; i<n ; i++)
        {
            int odd = lenofpalinword(s,i,i);
            int even = lenofpalinword(s,i,i+1);
            int max = Math.max(odd,even);

            if(maxlen<max)
            {
                maxlen = max;
                start = i-((maxlen-1)/2);
                end = i+(maxlen/2);
            }
        }

        return s.substring(start,end+1);
    }
    private static int lenofpalinword(String s,int left,int right)
    {
        while(left>=0 && right<s.length())
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                break;
            }
            left--;
            right++;
        }
        return right-left-1;
    }

    public static int beautySum(String s) {

        int n  = s.length();
        int output = 0;
        if(n<3)
        {
            return 0;
        }


        for (int i=0; i<n-2; i++)
        {
            for (int j=i+2; j<n; j++)
            {


                int[] hash = new int[26];
                for (int k = i; k <= j; k++) {
                    hash[s.charAt(k)-'a']++;
                }

                int MIN = Integer.MAX_VALUE; int MAX = Integer.MIN_VALUE;
                for (int k = i; k <=j ; k++) {
                    if(hash[(s.charAt(k)-'a')] > 0)
                    {
                        MIN = Math.min(MIN,hash[(s.charAt(k)-'a')]);
                        MAX = Math.max(MAX,hash[(s.charAt(k)-'a')]);
                        hash[(s.charAt(k)-'a')]=0;
                    }
                }
                output = output + (MAX-MIN);
            }
        }
        return output;
    }

    public static int longestValidParentheses(String s)
    {
        int n  = s.length();
        Stack<Character> st = new Stack<>();
        int output = 0;int len =0;
        for (int i=0; i<n; i++)
        {
            if(st.size()>1)
            {
                len = 0;
            }
            if(s.charAt(i)==')')
            {
                if(st.empty())
                {
                    continue;
                }
                else {
                    if (st.peek()=='(')
                    {
                        len+=2;
                        st.pop();
                    }
                }
            } else if (s.charAt(i)=='(') {
                st.add(s.charAt(i));
            }

            if(len>output)
            {
                output=len;
            }
        }
        return output;
    }

}


package Strings;

public class leetcodepractice
{
    public static void main(String[] args)
    {
        // all the question which are practice from leetcode

        //1.
//        String s = "abcABa";
//        System.out.println(frequencySort(s));

        //2.
//        String[] word1 = {"abc", "d", "defg"};
//        String[] word2= {"abcddefg"};
//        if(arrayStringsAreEqual(word1, word2))
//        {
//            System.out.println("TRue");
//        }
//        else {
//            System.out.println("FAlse");
//        }

        //3.
//        String s = "Hello how are you Contestant";
//        int k = 4;
//        String newstring  = truncateSentence(s, k);
//        System.out.println(newstring);

        //4.
//       String[] words = {"notapalindrome","racecar"};
//       String s =  firstPalindrome(words);
//        System.out.println(s);

        //5.
//        String[] words = {"pay","attention","practice","attend"};
//        String pref = "at";
//        int check = prefixCount(words,pref);
//        System.out.println(check);

        //6.
//        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//        int max  = mostWordsFound(sentences);
//        System.out.println(max);

        //7.
//        String s = "string";
//        String newstring = faultykeyboard(s);
//        System.out.println(newstring);

        //8.
//        String s = "a1b2c3d4e";
//       String newstring =  replaceDigits(s);
//        System.out.println(newstring);
    }



    public static String frequencySort(String s)
    {
        int n = s.length();
        int[] hash = new int[128];
        for(int i = 0; i < n; i++)
        {
            hash[s.charAt(i)]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i< hash.length; i++)
        {
            int flag = 0;
            int max = 0;
            int maxindx = -1;
            for (int j = 0; j < hash.length; j++)
            {
                if(hash[j]>max)
                {
                    max = hash[j];
                    maxindx = j;
                    flag = 1;
                }
            }
            if(flag==1)
            {
                char ch = (char) (maxindx);
                while(max!=0)
                {
                    sb.append(ch);
                    max--;
                }
                hash[maxindx]=0;
            }
            if(flag == 0)
            {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        int n  = word1.length;
        int m = word2.length;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().contentEquals(sb2);
    }

    public static String truncateSentence(String s, int k)
    {
        int n = s.length();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i< words.length)
        {
            if(k>1)
            {
                sb.append(words[i++]).append(" ");
                k--;
            }
            else {
                break;
            }
        }
        sb.append(words[i]);
        return sb.toString();
        /* optimize version
        public String truncateSentence(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
                if(count==k){
                    return s.substring(0,i);
                }
            }
        }
        return s;
         */
    }

    public static String firstPalindrome(String[] words)
    {
        int n = words.length;
        for(int i=0; i<n; i++)
        {
            if(iswordpalindrome(words[i]))
            {
                String s = new String(words[i]);
                return s;
            }
        }

        return "";
    }
    public static boolean iswordpalindrome(String word)
    {
        int n  = word.length();
        int left = 0,right = n-1;
        while(left<right)
        {
            if(word.charAt(left++)!=word.charAt(right--))
            {
                return false;
            }
        }
        return true;
    }

    public static int prefixCount(String[] words, String pref)
    {
        int n  = words.length;
        int count = 0;
        for(int i=0; i<n; i++)
        {
            String s = new String(words[i]);
            if(s.startsWith(pref))
            {
                count++;
            }
        }
        return count;
    }

    public static int mostWordsFound(String[] sentences)
    {
        int n  = sentences.length;
        int maxcount = 0;
        for(int i=0; i<n; i++)
        {
            int check = countwords(sentences[i]);
            if(check > maxcount)
            {
                maxcount = check;
            }
        }

        return maxcount;
    }
    public static int countwords(String sentence)
    {
        int n = sentence.length();
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(sentence.charAt(i)==' ')
            {
                count++;
            }
        }
        return count+1;
    }

    public static String faultykeyboard(String s)
    {
        int n  = s.length();//"string"
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++)
        {
            if(s.charAt(i)=='i')
            {
                sb.reverse();
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String replaceDigits(String s)
    {
        int n = s.length();//String s ="a1b2c3d4e";
        char[] chars = new char[n];
        int idx  = 0;
        for (int i=0; i<n-1; i+=2)
        {
            char ch = s.charAt(i);
            int digit = (s.charAt(i+1) - '0');
            chars[idx++] = ch;
            chars[idx++] = shift(ch,digit);
        }

        if (n % 2 != 0) {
            chars[idx++] = s.charAt(n - 1);
        }

        s = new String(chars);
        return s;
    }
    public static char shift(char ch, int digit)
    {
        return (char)(ch + digit);
    }

}




package Strings;


public class StringMethods {
    static @interface MyAnnotation{
        String value();
    }
    public static void main(String[] args) {

        char[] ch = new char[6];
        ch[0] = 'r';
        ch[1] = 'u';
        ch[2] = 's';
        ch[3] = 'h';
        ch[4] = 'i';
        ch[5] = 'l';
        String s1 = "rushil";
        String s2 = "rushil";
        String s3 = new String("rushil is a student");
        String s4  = new String(ch);

        String s5 = "45";
        System.out.println(s5.hashCode());




        //convert int to char
//        for (int i = 0; i <=126 ; i++) {
//            System.out.print((char)(i)+"-");
//        }
//        System.out.println((char)(65));

        //check string  a palindromic
//        while(true)
//        {
//            Scanner sc  = new Scanner(System.in);
//            StringBuilder sb = new StringBuilder(sc.nextLine());
//            StringBuilder sbr = new StringBuilder(sb);
//            sbr.reverse();
//            System.out.println(sb+"  "+ sbr);
//            if(sbr.toString().equals(sb.toString()))
//            {
//                System.out.println("True");
//            }
//            else {
//                System.out.println("False");
//            }
//        }


//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s4));

//        System.out.println( s1.codePointAt(2));


    }

}

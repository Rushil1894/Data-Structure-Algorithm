import java.util.Scanner;
public class arrayass1userinp {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int a = sc.nextInt();
        int[] arr= new int[a];
        System.out.println("enter elements for Array : ");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        //question 1
//        int d=3;
//        for(int i=0;i<a;i++)
//        {
//            if(arr[i]!=0)
//            {
//                if(arr[i]%d==0)
//                {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//
//        }

        //question 2
//        for(int i=0;i<a-1;i++)
//        {
//            if(arr[i]>arr[i+1])
//            {
//                System.out.println("false");
//                return;
//            }
//        }
//        System.out.println("true");

        //question 3
//        int m = a/2;//3
//        int[] a1=new int[m];
//        int [] a2= new int[a-m];
//
//        for(int i=0;i<m;i++)
//        {
//            a1[i]=arr[i];
//        }
//        for(int i=m;i<a;i++)
//        {
//            a2[i-m]=arr[i];
//        }
//        for(int i=0;i<a2.length;i++)
//        {
//            System.out.print(a2[i]+" ");
//        }

        //question 4
//        int count = 0,d=3;
//        for(int i=0;i<a;i++)
//        {
//            if(arr[i]==d)
//            {
//                count++;
//            }
//        }
//        System.out.println("repeated d in array : "+ count);

        //question 5
//        for(int i=0;i<a;i++)
//        {
//            int coun = 0;
//            for(int j=1;j<=arr[i]; j++)
//            {
//                if(arr[i]%j==0 )
//                {
//                    coun++;
//                }
//            }
//            if(coun==2) System.out.print(arr[i]+" ");
//        }


    }
}

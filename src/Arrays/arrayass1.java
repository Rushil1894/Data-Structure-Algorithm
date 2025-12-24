public class arrayass1 {
    public static void main(String[] args) {
        int[] arr={9,2,5,7,3,8,9,0};
        int n = arr.length;
        int d = 3;
        int count =0;

        //question 1
//      for(int i=0;i<n;i++)
//        {
//            if(arr[i]!=0)
//            {
//                if(arr[i]%d==0)
//                {
//                    System.out.println(arr[i]);
//                }
//            }
//
//        }
//
//        //question 2
//        for(int i=0;i<n-1;i++)
//        {
//            if(arr[i]>arr[i+1])
//            {
//                System.out.println("false");
//                return;
//            }
//        }
//        System.out.println("true");
//
//        //question 3
//       int m = n/2;//3
//        int[] a1=new int[m];
//        int [] a2= new int[n-m];
//
//        for(int i=0;i<m;i++)
//        {
//            a1[i]=arr[i];
//        }
//        for(int i=m;i<n;i++)
//        {
//            a2[i-m]=arr[i];
//        }
//        for(int i=0;i<a1.length;i++)
//        {
//            System.out.print(a1[i]+" ");
//        }
//
//        //question 4
//       for(int i=0;i<n;i++)
//        {
//            if(arr[i]==d)
//            {
//                count++;
//            }
//        }
//        System.out.println("repeated d in array : "+ count);
//
//        //question 5
//       for(int i=0;i<n;i++)
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
//
//        }
    }

}

public class insupddelarraysorted {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int n = arr.length;
        //p is only for indexing ...
        int p = 0;
        p=insertionsort(arr,p,30);
        p=insertionsort(arr,p,10);
        p=insertionsort(arr,p,40);
        p=insertionsort(arr,p,20);

        updatearr(arr,p,20,200);
        System.out.println(search(arr,p,200));
//        p=delete(arr,p,20);
        print( arr, p);

    }
    public static int insertionsort(int[] arr,int p,int  addvalue)
    {
        arr[p]=addvalue;
        if(p==0)
        {
            return p+1;
        }
        else
        {

            for(int i=1;i<=p;i++)
            {
                int demo = i;
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[i]<arr[j])
                    {
                        int temp = arr[i];
                        arr[i]= arr[j];
                        arr[j]=temp;
                        i=j;
                    }
                }
                i=demo;
            }
            return p+1;
        }

    }

//    public static void updatearr(int[] arr, int p,int oldvalue,int newvalue)
//    {
//        int flag = 0;
//
//        for(int i=0;i<p;i++)
//        {
//            if(arr[i]==oldvalue)
//            {
//                arr[i]=newvalue;
//                flag=1;
//                break;
//            }
//        }
//        if(flag==1)
//        {
//            for(int i=1;i<p;i++)
//            {
//                int demo = i;
//                for(int j=i-1;j>=0;j--)
//                {
//                    if(arr[i]<arr[j])
//                    {
//                        int temp = arr[i];
//                        arr[i]= arr[j];
//                        arr[j]=temp;
//                        i=j;
//                    }
//                }
//                i=demo;
//            }
//        }
//        else
//        {
//            System.out.println("value not found..");
//        }
//    }

    public static void updatearr(int[] arr, int p,int oldvalue,int newvalue)
    {
        p=delete( arr, p ,oldvalue);
        p=insertionsort( arr, p,  newvalue);
    }

    public static boolean search(int[] arr,int p,int fin)
    {
        int left = 0;
        int right = p-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==fin)
            {
                return true;
            }
            else if (arr[mid]>fin)
            {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return false;
    }

    public static int delete(int[] arr, int p ,int delvalue)
    {
        int index = -1;
        for(int i =0 ; i<p;i++)
        {
            if(arr[i]==delvalue)
            {
                index=i;
                break;
            }

        }
        if(index==-1)
        {
            System.out.println("not found..");
        }
        else
        {
            for(int i = index; i<p; i++)
            {
                arr[i]=arr[i+1];
            }
            return p-1;
        }

       return p;
    }

    public static void  print(int[] arr , int p)
    {
        for(int i=0;i<p;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}

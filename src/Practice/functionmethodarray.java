import java.util.Arrays;

public class functionmethodarray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int p=0;
        p=insert(arr,p,10);
        p=insert(arr,p,20);
        p=insert(arr,p,30);
        p=insert(arr,p,40);
        p=insert(arr,p,50);
//        p=insert(arr,p,60);
//        update(arr,p,20,200);
//        System.out.println(search(arr,p,200));
//        System.out.println(empty(arr,p));
//        System.out.println("size:" + p);
        p=delete(arr,p,50);
        print(arr,p);

    }

    public static int insert(int[] arr,int p,int value) {
        if(p==arr.length)
        {
            System.out.println("arrayisfull");
            return p ;
        }
        arr[p]=value;
        p++;
        return p;
    }
    public static void update(int[] arr,int p,int oldv,int newv) {
        for(int i=0;i<p;i++)
        {
            if(arr[i]==oldv)
            {
                arr[i]=newv;
            }
        }
    }
    public static void print(int[] arr,int p) {
        for(int i=0;i<p;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
    public static int delete(int[] arr, int p, int value) {
        int index = -1;
        for (int i = 0; i < p; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Value not found.");
            return p;
        }
        for (int i = index; i < p - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
        return p-1;
    }

    public static boolean search(int[] arr,int p,int value) {
        for(int i=0;i<p;i++)
        {
           if(arr[i]==value)
           {
                return true;
           }
        }
        return false;
    }
    public static boolean empty(int[] arr,int p) {
        if(p==0)
        {
            return true;
        }
        else {
            return false;
        }
    }

}

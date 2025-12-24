import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int n = arr.length;
        int flag = 0;
        for(int i=n-1; i>=0; i--)
        {
            if(arr[i]<9)
            {
                arr[i]+=1;
                flag=1;
                break;
            }
            arr[i]=0;
        }

        if(flag==0)
        {
            int[] res= new int[n+1];
            for(int i=1; i<n+1; i++)
            {
                res[0]=1;
                res[i]=arr[i-1];
            }
            System.out.println(Arrays.toString(res));
        }
        else
        {
            System.out.println(Arrays.toString(arr));
        }


    }
}

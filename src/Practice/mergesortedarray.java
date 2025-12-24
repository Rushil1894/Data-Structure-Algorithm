import java.util.Arrays;

public class mergesortedarray {
    public static void main(String[] args) {
        int[] arr={2,2,1};
//        int[] arr2={2,5,6};
//        int n = 3;
//       int m = arr2.length;
//
//        int i = 0;
//        int j = 0;
//        while((i!=n)&&(j!=m))
//        {
//            if(arr[i] == arr2[j])
//            {
//                i++;
//            }
//            else if (arr[i]>arr[j] || arr[i]==0)
//            {
//                int temp = arr[i];
//                arr[i]= arr2[j];
//                arr2[j]=temp;
//                i++;
//                if(arr2[j]==0)
//                {
//                    j++;
//                }
//            }
//            else
//            {
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        int i = n - 1;         // Index of last element in arr's valid portion
//        int j = m - 1;         // Index of last element in arr2
//        int k = n + m - 1;     // Index of last position in arr (total length)
//
//        // Merge from the end
//        while (i >= 0 && j >= 0) {
//            if (arr[i] > arr2[j]) {
//                arr[k--] = arr[i--];
//            } else {
//                arr[k--] = arr2[j--];
//            }
//        }
//
//        // If arr2 still has elements, copy them
//        while (j >= 0) {
//            arr[k--] = arr2[j--];
//        }
//        System.out.println(Arrays.toString(arr));

       // Count unique from leetcode
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int count=0;
            for(int j=0; j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    if(count>1)
                    {
                        break;
                    }
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
            }
        }

    }
}

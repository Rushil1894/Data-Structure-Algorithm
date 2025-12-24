package Arrays;

import java.util.Arrays;

public class oddfronttheneven {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,7};
        int n = arr.length;

        int left=0,right= n-1;
        while(left < right)
        {
            if(arr[right]%2==0)
            {
                right--;
            } else if (arr[left]%2==1)
            {
                left++;
            }
            else {
                int temp= arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

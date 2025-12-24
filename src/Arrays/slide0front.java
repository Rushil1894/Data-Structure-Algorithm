import java.util.Arrays;

public class slide0front {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,1,0};
        int n = arr.length;

        int left = 0,right= n-1;
        while(left < right )
        {
            if(arr[right]==1)
            {
                right--;
            } else if (arr[left]==0)
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

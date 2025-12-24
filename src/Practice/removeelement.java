import java.util.Arrays;

public class removeelement {
    public static void main(String[] args) {
        int [] arr={0,1,1,2,3,3,4,2,5};
        int n = arr.length;
        int tar=2;
        int count = 0;
        int left = 0,right=n-1;
        while(left <= right) {
            if (arr[right] == tar) {
                right--;
            } else if (arr[left] == tar) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
                left++;
                count++;
            }
            else {
                left++;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}

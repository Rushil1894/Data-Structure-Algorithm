import java.util.Arrays;

public class arrayduplicateonly {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
        if (n == 0) {
            System.out.println("[]");
            System.out.println(0);
            return ;
        }

        int k = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(arr, k)));
        System.out.println(k);
    }
}

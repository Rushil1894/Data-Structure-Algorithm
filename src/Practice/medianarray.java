import java.util.Arrays;

public class medianarray {
    public static void main(String[] args) {
        int[] arr1 = {3,2,1};
        int[] arr2= {6,5,4};
        int n= arr1.length + arr2.length;
        float[] arr3 = new float[n];

        for(int i=0; i< arr1.length; i++)
        {
            arr3[i]= arr1[i];
        }
        for(int j=arr1.length; j<n; j++)
        {
            arr3[j]= arr2[j-arr1.length];
        }

        Arrays.sort(arr3);

        if(n%2==1)
        {
            System.out.println(arr3[n/2]);
        }
        else {
            System.out.println((arr3[(n/2)-1] + arr3[n/2]) /2);
        }
        System.out.println(Arrays.toString(arr3));
    }
}

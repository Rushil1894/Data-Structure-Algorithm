public class logn {
    public static void main(String[] args) {
        int [] arr = {2,8,16,23,28,35};
        int n = arr.length;
        int sum=44;

        for(int i=0; i<n-1; i++)
        {
            int left=i+1,right=n-1;
            int k = sum-arr[i];

            while(left <= right)
            {
                int mid = (left + right )/2;
                if(arr[mid]==k)
                {
                    System.out.println("present");
                    return;
                } else if (arr[mid]<k)
                {
                    left=mid+1;
                }
                else {
                    right=mid-1;
                }
            }

        }
        System.out.println("not");
    }
}

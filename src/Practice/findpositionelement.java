public class findpositionelement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int n = arr.length;
        int tar =2;
        int left = 0, right= n-1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(arr[mid]==tar){
                System.out.println(mid);
                return;
            } else if (tar>arr[mid])
            {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        System.out.println(left);

    }
}

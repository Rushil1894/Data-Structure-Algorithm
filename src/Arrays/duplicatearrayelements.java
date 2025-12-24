public class duplicatearrayelements {
    public static void main(String[] args) {
        int[] arr={5,2,4,5,6,2,5,6};
        int n= arr.length;

        for(int i=0; i<n; i++)
        {
            int flag  = 0;

            for(int j=0; j<i; j++)
            {
                if(arr[i]== arr[j])
                {
                    flag=1;
                    break;
                }
            }

            if(flag==1)
            {
                continue;
            }

            int count = 0;

            for(int j=0; j<n; j++)
            {
                if(arr[i]== arr[j])
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

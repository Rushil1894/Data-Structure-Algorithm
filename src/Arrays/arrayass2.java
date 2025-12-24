public class arrayass2 {
    public static void main(String[] args) {
        int[] arr =   {7, 10, 17, 22, 19, 40, 1, 3, 5};
        int n = arr.length;
        int label = 0;
        int maxele = -1;
        int target = 10;
        int maxcount = 0;
//      question 1:-
//        for(int i=0;i<n;i++)
//        {
//            int flag = 0;
//            if(i==n-1)
//            {
//                System.out.print("-1 ");
//                return;
//            }
//            for(int j=i+1;j<n;j++)
//            {
//                if(arr[i]<arr[j])
//                {
//                    System.out.print(arr[j]+" ");
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag==0)
//            {
//                System.out.print("-1 ");
//            }
//        }

//        question 2:-
//       for(int i=0;i<n;i++)
//       {
//           int count=0;
//           for(int j=0;j<n;j++)
//           {
//               if(arr[i]==arr[j])
//               {
//                    count++;
//                    if(count==2)
//                    {
//                        System.out.print(arr[i]+" ");
//                        label++;
//                        break;
//                    }
//               }
//           }
//           if(label==2)
//           {
//               break;
//           }
//
//       }

        

//        question 3:-
//        for (int i = 0; i < n; i++)
//        {
//            int count = 0;
//            for(int j=0;j<n;j++)
//            {
//                if(arr[i]==arr[j])
//               {
//                    count++;
//               }
//            }
//            if(count>maxcount)
//            {
//                maxcount=count;
//                maxele=arr[i];
//            }
//        }
//        System.out.println(maxele);

//        question 4:-
//            int left = 0;
//            int right = n-1;
//            while(left<=right)
//            {
//                int mid= (left+right)/2;
//                if(arr[mid]==target)
//                {
//                    System.out.println("Present");
//                    return;
//                }
//                else if (arr[mid]>=arr[left])
//                {
//                    if(arr[left]<=target && target<arr[mid])
//                    {
//                        right = mid-1;
//                    }
//                    else
//                    {
//                        left = mid+1;
//                    }
//                }
//                else if (arr[mid]<arr[right])
//                {
//                    if(arr[mid]<=target && target<arr[right])
//                    {
//                        left = mid+1;
//                    }
//                    else
//                    {
//                        right = mid-1;
//                    }
//                }
//
//            }
//        System.out.println("Not Present");
    }
}































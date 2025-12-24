import java.util.ArrayList;

public class diff {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        ArrayList<Integer> list1 = new ArrayList<>();
//
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        list2.add(10);
//        list2.add(20);
//        list2.add(30);

        ArrayList<ArrayList<Integer>> nestedlist = new ArrayList<>();

        nestedlist.add(new ArrayList<>());
        nestedlist.get(0).add(0);
        nestedlist.get(0).add(1);
        nestedlist.get(0).add(0);

        nestedlist.add(new ArrayList<>());
        nestedlist.get(1).add(1);
        nestedlist.get(1).add(1);
        nestedlist.get(1).add(0);

        nestedlist.add(new ArrayList<>());
        nestedlist.get(2).add(0);
        nestedlist.get(2).add(1);
        nestedlist.get(2).add(1);

        int row  = nestedlist.size();
        int col = nestedlist.get(0).size();


//        for (int i = 0; i <row; i++)
//        {
//            for (int j = 0; j < col; j++)
//            {
//                System.out.print(nestedlist.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i <row; i++)
        {
            int left = 0,right = col-1;
            while (left<=right)
            {
                int temp = nestedlist.get(i).get(left);
                nestedlist.get(i).set(left, nestedlist.get(i).get(right));
                nestedlist.get(i).set(right,temp);
                left++;
                right--;
            }
        }

        for (int i = 0; i <row ; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(nestedlist.get(i).get(j)==0)
                {
                    nestedlist.get(i).set(j , 1);
                }
                else
                {
                    nestedlist.get(i).set(j , 0);
                }
            }
        }
        for (int i = 0; i <row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(nestedlist.get(i).get(j)+" ");
            }
            System.out.println();
        }

//        nestedlist.get(0).set(2,40);

//        System.out.println(nestedlist);
//        int[] nums = {1, 15, 6, 3};
//        int n = nums.length;
//        int sum = 0;
//        int digisum = 0;
//        for (int i = 0; i < n; i++) {
//            sum = sum + nums[i];
//        }
//        for (int i = 0; i < n; i++) {
//            int temp = nums[i];
//            while (nums[i] != 0) {
//                int mod = nums[i] % 10;
//                digisum = digisum + mod;
//                nums[i] = nums[i] / 10;
//            }
//            nums[i] = temp;
//        }
//        System.out.println((digisum - sum));
    }
}

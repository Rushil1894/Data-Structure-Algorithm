package TwoD_matrix;

public class ass1 {
    public static void main(String[] args) {
//        int[][] mat = new int[4][3];
        int[][] mat  = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
                };

        int row = mat.length;
        int col = mat[0].length;
//        question1(mat, row,  col);
//        question2(mat, row,  col);
//        question3(mat, row,  col);
//        question4(mat, row,  col);
    }

    public static void question1(int[][] mat, int row, int col)
    {
            for(int i=0;i<row;i++)
            {
                if(i%2==1)
                {
                    for(int j=col-1 ; j>=0;j--)
                    {
                        System.out.print(mat[i][j]+" ");
                    }
                    System.out.println();
                }
                else
                {
                    for(int j=0 ; j<col;j++)
                    {
                        System.out.print(mat[i][j]+" ");
                    }
                    System.out.println();
                }
            }

    }

    public static void question2(int[][] mat, int row, int col)
    {
        for(int j=0;j<col;j++)
        {
            if(j%2==1)
            {
                for(int i=row-1 ; i>=0;i--)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            else
            {
                for(int i=0 ; i<row;i++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }

    }

    public static void question3(int[][] mat, int row, int col)
    {

        for(int i=0;i<row;i++)
        {
            int maxfromrow = 0;
            for(int j=0 ; j<col;j++)
            {
                if(mat[i][j]>maxfromrow)
                {
                    maxfromrow = mat[i][j];
                }
            }
            System.out.println(maxfromrow);

        }

    }

    public static void question4(int[][] mat, int row, int col)
    {

        for(int j=0;j<col;j++)
        {
            int maxfromrow = 0;
            for(int i=0 ; i<row;i++)
            {
                if(mat[i][j]>maxfromrow)
                {
                    maxfromrow = mat[i][j];
                }
            }
            System.out.println(maxfromrow);

        }

    }
}

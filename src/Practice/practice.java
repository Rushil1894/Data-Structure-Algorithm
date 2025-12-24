
public class practice
{
    public static void main(String[] args)
    {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int row  = mat.length;
        int col = mat[0].length;

//        changeinmemory(mat,row ,col);

        changeinmemory2(mat,row ,col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] changeinmemory(int[][]mat,int row ,int col)
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = i; j < col; j++)
            {
                int temp = mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < row; i++)
        {
            int left = 0,right = col-1;
            while(left <= right)
            {
                int temp = mat[i][left];
                mat[i][left]= mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
       return mat;
    }

    public static int[][] changeinmemory2(int[][]mat,int row ,int col)
    {
        int last  = row-1;
        int lastcol = col-1;

//        for (int i = 0; i < row; i++)
//        {
//            for (int j = i; j < col; j++)
//            {
//                int temp  = mat[i][j];
//                mat[i][j] = mat[last][j];
//                mat[last][j] = mat[last][lastcol];
//                mat[last][lastcol] = mat[i][lastcol];
//                mat[i][lastcol] = temp;
//                last--;
//                lastcol--;
//            }
//
//        }

        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;

        while(left <= right && top<=bottom)
        {
            int temp  = mat[top][left];
            mat[top][left] = mat[bottom][left];
            mat[bottom][left] =  mat[bottom][right] ;
            mat[bottom][right] = mat[top][right];
            mat[top][right] = temp;
            top++;
            bottom--;
            left++;
            right--;
        }
        return mat;
    }
}




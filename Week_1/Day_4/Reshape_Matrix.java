package Week_1.Day_4;

public class Reshape_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(m*n != r*c) return mat;
        int[][] ans = new int[r][c];
        int x =0 ;
        int y = 0 ;
        for(int i = 0 ; i< n; i ++) {
            for(int j = 0 ; j <m ; j++) {
                int a = mat[i][j];
                if(y>c-1) {
                    x = x + 1;
                    y = 0 ;
                }
                ans[x][y]=a;
                y++;
            }
        }
        return ans;
    }
}

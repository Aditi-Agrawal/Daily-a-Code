class Solution {

    //This question in interview - looking for
    //1. How fast you can think
    //2. How clean code you can write
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m*n) return mat;
        int[][] arr = new int[r][c];
        int rr = 0;
        int cc = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rr<r && cc<c){
                    arr[rr][cc]=mat[i][j];
                    cc += 1;
                }
                if(cc>=c){
                    cc = 0;;
                    rr += 1;
                }
            }            
        }   
        return arr;
    }
}
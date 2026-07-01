class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        Boolean ans = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target == matrix[i][j]){
                    ans = true;
                }
            }
        }
        return ans;
    }
}
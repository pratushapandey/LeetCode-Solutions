class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        for(int row = 0;row<m;row++){
            // binary search
            int i = 0,j = n-1;
            long int mid;
            while(i<=j){
                mid = i + (j-i)/2;
                if(matrix[row][mid] == target) return true;
                if(matrix[row][mid] > target) j = mid - 1;
                else i = mid + 1;
            }
        }
        return false;
    }
};

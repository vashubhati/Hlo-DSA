class Solution {
public:
    void setZeroes(vector<vector<int>>& matri) {
        int m = matri.size();
        int n = matri[0].size();

        vector<int> row(m,0) , col(n,0);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (matri[i][j] == 0)
                row[i] = col[j] = 1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (row[i] || col[j])
                matri[i][j]=0;
            }
        }
    }
};    
       
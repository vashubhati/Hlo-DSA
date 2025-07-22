class Solution {//vashu
public:
    vector<vector<int>> generate(int numRows) {
    vector<vector<int>> vashu( numRows);{
        for(int i=0;i<numRows;i++){
            vashu[i]=vector<int>(i+1,1);
            for(int j=1;j<i;j++)
           vashu[i][j] = vashu[i-1][j]+ vashu[i-1][j-1];
        }
    }
   return vashu; }
    
};
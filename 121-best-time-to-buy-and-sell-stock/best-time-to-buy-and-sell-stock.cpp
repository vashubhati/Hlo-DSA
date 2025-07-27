class Solution {
public:
    int maxProfit(vector<int>& price) {
        
    int maxPro = 0;
    int n = price.size();
    int minPrice = INT_MAX;

    for (int i = 0; i < price.size(); i++) {
        minPrice = min(minPrice, price[i]);
        maxPro = max(maxPro, price[i] - minPrice);
    }
    
    return maxPro;
}


        
    
};
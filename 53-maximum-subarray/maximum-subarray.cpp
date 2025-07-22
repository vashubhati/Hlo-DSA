class Solution {
public:
    int maxSubArray(vector<int>& nums) {

    int maxi = INT_MIN; // maximum sum
    int sum = 0;

    for (int i = 0; i < nums.size(); i++) {

        sum += nums[i];

        if (sum > maxi) {
            maxi = sum;
        }

        // If sum < 0: discard the sum calculated
        if (sum < 0) {
            sum = 0;
        }
    }

    // To consider the sum of the empty subarray
    // uncomment the following check:

    //if (maxi < 0) maxi = 0;

    return maxi;
}


};
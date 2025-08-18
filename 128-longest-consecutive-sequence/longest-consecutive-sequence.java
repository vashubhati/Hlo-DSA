class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lsts=1;
        int maxseq=1;
        if(nums.length==0){
            return 0;
        }
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1] - nums[i]==1){
                lsts +=1;
             maxseq = Math.max(maxseq,lsts);

            }
              else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else{
                lsts = 1;
            }

        } 
        return maxseq;
    }
}
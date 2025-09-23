class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=0;i<m;i++){
            arr1.add(nums1[i]);
        }
        for (int i=0;i<n;i++){
            arr1.add(nums2[i]);
        }
        Collections.sort(arr1);
        for(int i=0;i<arr1.size();i++){
            nums1[i]= arr1.get(i);
        }
        
    }
}
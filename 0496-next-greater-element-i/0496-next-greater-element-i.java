class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int cur= nums1[i];
            int index = -1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==cur){
                    index=j;
                    break;
                }
            }
            ans[i]=-1;
            for(int j=index+1;j<nums2.length;j++){
                if(nums2[j]>cur){
                   ans[i] = nums2[j];
                   break;
                }

            }
        }
        return ans;
    }
}
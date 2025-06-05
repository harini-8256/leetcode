class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
        }
        if(c==0){
            return true;
        }
        else if(c==1){
            return nums[n-1]<=nums[0];
        }
        else{
            return false;
        }
    }
}
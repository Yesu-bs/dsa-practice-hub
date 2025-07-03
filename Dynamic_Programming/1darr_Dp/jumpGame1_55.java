class Solution {
    public boolean canJump(int[] nums) {


        int max=nums[0];

        for(int i=1;i<nums.length;i++){

            if(max>=i){
                max=Math.max(max,i+nums[i]);
            }else{
                return false;
            }
        }
        return true;
    }
}
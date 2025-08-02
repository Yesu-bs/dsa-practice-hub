class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                return new int[]{i+1,1+j};
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{0,0};
    }
}
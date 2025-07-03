class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int curmax=nums[0];
        int i=1;
        int jump=1;
        int max=curmax;

        while(curmax<nums.length-1){
            while(i<=curmax){
                max=Math.max(max,i+nums[i]);
                i++;
            }
            jump++;
            curmax=max;

        }
        return jump;
    }
}
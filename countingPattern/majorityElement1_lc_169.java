class Solution {
    public int majorityElement(int[] nums) {

        int count=1;
        int val=nums[0];

        for(int i=1;i<nums.length;i++){
            if(val==nums[i]){
                count++;
            }else{
                count--;
                if(count==0){
                    val=nums[i];
                    count=1;
                }
            }
        }
        return val;

    }
}
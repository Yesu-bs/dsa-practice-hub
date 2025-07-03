class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        int i=1;
        int j=1;
        if(nums[0]==nums[1]){
            i=2;
            j=2;
        }

        while(j<nums.length){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                i++;

                if((j<nums.length-1)&&(nums[j]==nums[j+1])){
                    nums[i]=nums[j];
                    i++;
                }

                j++;
            }else{
                j++;
            }
        }
        return i;
    }
}
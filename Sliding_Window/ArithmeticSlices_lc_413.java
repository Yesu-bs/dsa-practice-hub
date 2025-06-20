class Solution {
    static public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int count=0;
        int dif[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            dif[i]=nums[i]-nums[i-1];
        }

        int i=0;int j=2;
        while(j<nums.length){
            if(dif[j]==dif[j-1]){
                if(j-i+1>2){

                    int addable=(j-i+1)-2;
                    count+=addable;
                }
            }else{
                i=j-1;
            }
            j++;

        }


        return count;
    }
}
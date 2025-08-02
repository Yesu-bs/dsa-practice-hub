import java.math.BigInteger;
import java.util.Stack;

class Solution {
    public String largestNumber(int[] nums) {


        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]!=0){
                break;
            }
        }
        if(i==nums.length){
            return "0";
        }

        i=0;

        for(;i<nums.length1-1;i++){
            for(int j=i+1;j<nums.length;j++){

                String ij=nums[i]+""+nums[j];
                String ji=nums[j]+""+nums[i];
                if(Long.parseUnsignedLong(ji)>Long.parseUnsignedLong(ij)){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;

                }
            }
        }

        StringBuilder ans=new StringBuilder();
        for(i=0;i<nums.length;i++){
            ans.append(nums[i]);
        }
        return ans;
    }
}
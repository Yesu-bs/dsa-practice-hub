class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] pre=new int[nums.length];
        int suf[]=new int[nums.length];
        pre[0]=1;
        suf[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            suf[j]=suf[j+1]*nums[j+1];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=pre[i]*suf[i];
        }
        return ans;
    }
}
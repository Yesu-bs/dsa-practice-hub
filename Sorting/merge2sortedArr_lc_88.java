class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int k=nums1.length-1;

        int i=m-1;
        int j=n-1;
        if(m==0){
            for(int a=0;a<n;a++){
                nums1[a]=nums2[a];
            }
            return;
        }

        while(i>=0&&j>=0){

            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }else{
                nums1[k]=nums2[j];
                j--;k--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }

    }
}


public double findMaxAverage(int[] nums, int k) {


    double sum=0;
    for(int i=0;i<k;i++){
        sum+=nums[i];
    }
    int i=0;
    int j=0;

    double  max=sum/k;
    while(j<nums.length-1){
        sum-=nums[i];
        i++;
        sum+=nums[++j];

        max=Math.max(max,sum/k);
    }

    return max;
}
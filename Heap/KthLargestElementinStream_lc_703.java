class KthLargest {

    PriorityQueue<Integer> minheap=new PriorityQueue<>();
    PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
    int anotherk;
    public KthLargest(int k, int[] nums) {
        anotherk=k;
        for(int i=0;i<nums.length;i++){
            if(i+1>k){
                int curnum=minheap.peek();
                if(nums[i]<=curnum){
                    maxheap.add(nums[i]);
                }else{
                    maxheap.add(minheap.poll());
                    minheap.add(nums[i]);
                }
            }else{
                minheap.add(nums[i]);
            }
        }
    }

    public int add(int val) {


        if(minheap.size()<anotherk){
            minheap.add(val);
            return minheap.peek();
        }

        int max=minheap.peek();
        if(val<=max){
            maxheap.add(val);
            return max;
        }else{
            maxheap.add(minheap.poll());
            minheap.add(val);
            return minheap.peek();
        }

    }
}
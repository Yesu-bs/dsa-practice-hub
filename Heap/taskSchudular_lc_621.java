class Solution {
    static public int leastInterval(char[] tasks, int n) {

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        for(char c:map.keySet()){
            maxHeap.add(map.get(c));
        }

        ArrayList<int[]> list=new ArrayList<>();
        int time=0;

        while(list.size()!=0|| maxHeap.size()!=0){
            int curnum=0;

            time++;
            if(maxHeap.size()>0){
                curnum=maxHeap.poll();
            }if(--curnum>0){
                list.add(new int[]{time+n,curnum});
            }
            if(list.size()>0&&list.get(0)[0]==time){
                int[] arr=list.get(0);
                list.remove(0);
                maxHeap.add(arr[1]);
            }


        }
        return time;
    }
}
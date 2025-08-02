class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gascount=0;
        int costcount=0;
        for(int i=0;i<gas.length;i++){
            gascount+=gas[i];
            costcount+=cost[i];
        }
        if(gascount<costcount){
            return -1;
        }
        int fuel=0;
        int start=0;
        for(int i=0;i<gas.length;i++){

            fuel+=(gas[i]-cost[i]);
            if(fuel<0){
                fuel=0;
                start=i+1;
            }
        }
        return start;
    }
}
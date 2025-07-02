public class happyNum {
    public static void main(String args[]){

        System.out.println(isHappy(19));
    }
    static public boolean isHappy(int n) {


        int fast=0;
        int slow=0;

        int temp=n;
        while(temp>0){
            slow+=(temp%10)*(temp%10);
            temp=temp/10;
        }
        temp=slow;
        while(temp>0){
            fast+=(temp%10)*(temp%10);
            temp=temp/10;
        }
        while(fast!=slow){

            int curslownum=slow;

            slow=0;
            while (curslownum>0){
                slow+=(curslownum%10)*(curslownum%10);
                curslownum=curslownum/10;
            }
            for(int i=0;i<2;i++){
                int curfastnum=fast;
                fast=0;
                while (curfastnum>0){
                    fast+=(curfastnum%10)*(curfastnum%10);
                    curfastnum=curfastnum/10;
                }
            }

        }

        return slow==1;
    }
}

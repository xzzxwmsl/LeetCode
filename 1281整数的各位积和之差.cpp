class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum=0;
        int ji=1;
        while(n!=0){
            int p=n%10;
            sum+=p;
            ji*=p;
            n/=10;
        }


        return ji-sum;
    }
};

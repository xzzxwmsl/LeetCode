class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int> p;
        int k=n/2;
        while(k>0){
            p.push_back(k);
            p.push_back(-1*k);
            k--;
        }

        if(n%2==1) p.push_back(0);

        return p;
    }
};

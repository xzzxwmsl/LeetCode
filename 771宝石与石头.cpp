class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int flag=0;
        for(int i=0;i<J.length();i++){
            char c=J[i];
            for(int j=0;j<S.length();j++)
                if(c==S[j]) flag++;
        }
        return flag;
    }
    
};

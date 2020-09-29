class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int re = 0;
        int len=nums.size();
	    for (int i = 0; i < len ; i++) {
		    int flag = nums[i];
		    int j = 0;
		    while (flag!= 0) {
			    flag /= 10;
			    j++;
		    }
		    j % 2 == 0 ? re++ : re;
    	}

        return re;
    }
};

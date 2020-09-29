//if的顺序很重要！
class Solution {
public:
    string removeOuterParentheses(string S) {
	string re="";
	int p = 0, len = S.length();
	stack<char> mystack;
	while (p < len) {
		if (S[p] == ')') mystack.pop();
		if (!mystack.empty()) re += S[p];
		if (S[p] == '(') mystack.push('(');
		p++;
	}//while for string 
    return re;
    }
};

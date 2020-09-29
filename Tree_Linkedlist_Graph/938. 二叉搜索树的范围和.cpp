/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int sum=0;
    void midOrder(TreeNode* n, int L, int R){
        if(n!=NULL){
            midOrder(n->left,L,R);

            if((n->val) >=L && (n->val) <=R) sum+=n->val;

            midOrder(n->right,L,R);
        }
    }
    int rangeSumBST(TreeNode* root, int L, int R) {
    
    midOrder(root,L,R);
    return  sum;
    }
};

class Solution {
    public:
     string removeOuterParentheses(string s) {
        int n = s.size();
        int count =0;
        string res;
        for(int i=0;i<n;i++){
            if(s[i]=='(' && count == 0){
                count ++;
            }
            else if(s[i]=='(' && count >= 1){
                res += s[i];
                count ++;
            }
            else if(s[i]==')' && count >1){
                res += s[i];
                count--;
            }
            else if(s[i]==')' && count == 1){
                count--;
            }
        }
        return res;
    }
};
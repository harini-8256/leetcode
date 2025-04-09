class Solution {
    public int longestValidParentheses(String s) {
        Stack<  Integer> st = new Stack<>();
        st.push(-1);
        int c=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);

                }
                else{
                     len =Math.max(c,i-st.peek());
                }
            }
            
        }
        return len;
    }
}
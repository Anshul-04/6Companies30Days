class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack <Integer> st = new Stack<>();
        
        //If curr element is any operator then we pop from stack 2 times
        // and do the operation according to curr and then again push the result into stack 
        for(String token : tokens){
            if(token.equals("+")){
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2+n1);
            }
            else if(token.equals("*")){
                 int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2*n1);
            }
            else if(token.equals("-")){
                 int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2-n1);
            }
            else if(token.equals("/")){
                 int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2/n1);
            }
            else{
                //If token is any operand the convert it into Integer and push in the stack
                st.push(Integer.valueOf(token));
            }
        }
        return st.pop();
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0 || tokens == null){
            return -1;
        }
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";
        for(String cur : tokens){
            if(!operators.contains(cur)){
                stack.push(Integer.valueOf(cur));
                continue;
            }
            int a=stack.pop();
            int b=stack.pop();

            if(cur.equals("+")){
                stack.push(a+b);
            }
            else if(cur.equals("-")){
                stack.push(b-a);
            }
            else if(cur.equals("*")){
                stack.push(a*b);
            }
            else {
                stack.push(b/a);
            }
        }
            return stack.pop();
                  
    }
}
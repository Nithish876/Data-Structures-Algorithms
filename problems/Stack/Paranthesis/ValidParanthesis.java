class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // push
            } else {
                if (top == -1) return false; // no match
                char open = stack[top--];   // pop
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return top == -1;  
    }
}


public class ValidParanthesis{
    public static void main(String[] args){
        Solution ParanthesisValidator = new Solution();
        String testCase1 = "{{[]}}";
        String ans = ParanthesisValidator.isValid(testCase1) ? "valid":"invalid";
        System.out.print("The Given string of paranthesis are "+ans);
    }
}
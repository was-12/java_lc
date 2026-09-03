    package Strings;

    import java.util.Stack;

    public class LongestValidParenthesis{
        public int longestValidParentheses(String s) {
            int count = 0;
            boolean stillPresent = false;
            Stack<Character> stack = new Stack<Character>();
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '(') {
                    stillPresent = true;
                    stack.push(')');
                    //   else continue
                       }
                    if (charArray[i] == ')') {

                        if (stack.pop() == ')') {

                            count = count + 2;
                        } else continue;
                    }
                }
            return count;
        }
        public static void main(String[] args) {
            LongestValidParenthesis longestValidParenthesis = new LongestValidParenthesis();
           int ans=longestValidParenthesis.longestValidParentheses("()(())");
            System.out.println(ans);
        }
    }

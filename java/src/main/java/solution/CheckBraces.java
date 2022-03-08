package solution;

import java.util.Stack;

public class CheckBraces {

    private final String openBraces = "([{";
    private final String closeBraces = ")]}";

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String> ();
        for(int i=0; i<s.length(); i++)
        {
            String curChar = s.substring(i,i+1);
            if(openBraces.contains(curChar))
            {
                stack.push(curChar);
            }
            else
            {
                int indexFound = closeBraces.indexOf(curChar);
                if(indexFound < 0)
                {
                    return false;
                }

                if(stack.size() == 0)
                {
                    return false;
                }

                String last = stack.pop();
                if(!last.equals(openBraces.substring(indexFound,indexFound+1)))
                {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
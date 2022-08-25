import java.sql.SQLData;
import java.util.Stack;

public class ParenthesesChecker {

//METHOD: Checking parentheses-----
    public boolean checkParentheses(String string) {
        //    Create a Stack of Characters
        Stack<Character> checker = new Stack<>();

//       Move through the String = Character Array, 0 based index (i = 0)
        for (int i = 0; i < string.length(); i++)
        {

        }

//      character index is stored in "indicator" variable when looping
//      indicator 0 = specific character at index 0, indicator 1 = specific character at index 1...
        char indicator = string.charAt(0);

//        if expression[i] is '(' or '{' or '[', push (expression [i]) into the stack (will stack like pancake)

        if(indicator == '(' || indicator == '{' || indicator == '['){
            checker.push (indicator);
        }
//        else if expression [i] is ')' or '}' or ']',
        else if(indicator == ')' || indicator == '}' || indicator == ']'){
            return false;

        }
//        if (stack is empty) || (top does not pair with the expression [i]),
//        Return false.
//        Else, Pop (),
//        Return Stack is empty ? true : false










        }
}

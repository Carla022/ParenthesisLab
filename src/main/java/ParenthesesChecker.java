import java.util.Stack;
public class ParenthesesChecker {

    // METHOD: Checking parentheses-----

    public boolean checkParentheses(String string) {
//    Create a Stack of Characters
        Stack<Character> stackOfCharacters= new Stack<>();

//       Move through the String = Character Array, 0 based index (i = 0)
        for (int i = 0; i < string.length(); i++) {

//      character index is stored in "indicator" variable when looping
//      indicator 0 = specific character at index 0, indicator 1 = specific character at index 1...
            char indicator = string.charAt(i);

//        if expression[i] is '(' or '{' or '[', push (expression [i]) into the stack (will stack like pancake)
            if (indicator == '(' || indicator == '[' || indicator == '<' || indicator == '{'){
                stackOfCharacters.push(indicator);

//        else if expression [i] is ')' or '}' or ']',
            } else if (indicator == ')' || indicator == '}' || indicator == ']'){

//        if (stack is empty: means if there is no opening in stack) || (top does not (! means NOT) pair with the expression [i])
//         PEEK method will look at the top item (latest) that was added in the stack...
                if (stackOfCharacters.isEmpty()){
//        Return false.
                    return false;

//                    otherwise if...
                } else {

//from the stack, see if top character is equal paired characters (open + close) or... and if true, pop it.
                    if     ((stackOfCharacters.peek() == '(' && indicator == ')') ||
                            (stackOfCharacters.peek() == '{' && indicator == '}') ||
                            (stackOfCharacters.peek() == '[' && indicator == ']')) {

                        stackOfCharacters.pop();

                    }
                }
            }

        }

        if (stackOfCharacters.empty()){
            return true;


        } else {
            return false;
        }
    }

}



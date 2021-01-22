import java.util.*; 
  
public class BalancedBrackets { 
    // membalancekan brackets
    static boolean areBracketsBalanced(String expr) 
    { 
        Deque<Character> stack 
            = new ArrayDeque<Character>(); 
        for (int i = 0; i < expr.length(); i++)  
        { 
            char x = expr.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{')  
            { 
                // dipush 
                stack.push(x); 
                continue; 
            } 
  
            // lalu dipop 
            if (stack.isEmpty()){
                return false; 
            } 
            char check; 
            switch (x) { 
            case ')': 
                check = stack.pop(); 
                if (check == '{' || check == '[') 
                    return false; 
                break; 
  
            case '}': 
                check = stack.pop(); 
                if (check == '(' || check == '[') 
                    return false; 
                break; 
  
            case ']': 
                check = stack.pop(); 
                if (check == '(' || check == '{') 
                    return false; 
                break; 
            } 
        } 
  
        return (stack.isEmpty()); 
    } 

    public static void main(String[] args) 
    { 
        // String expr = "{[()]}";
        String expr = "{[(])}";
        // String expr = "{(([])[])[]}";
  
        if (areBracketsBalanced(expr)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 
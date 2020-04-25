
import java.util.*;
public class StackDemoPeek
{
    public static void main(String args[])
    {
        Stack<String> STACK = new Stack<String>();
        
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");
        
        System.out.println("Initial Stack: " + STACK);
        
        System.out.println("The element at the top of the" + "stack is: " +STACK.peek());
        
        System.out.println("Final Stack: " +STACK);
    }
}

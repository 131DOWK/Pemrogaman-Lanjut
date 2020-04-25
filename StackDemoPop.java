import java.util.*;
public class StackDemoPop
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
        
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " + STACK.pop());
        
        System.out.println("Stack after pop operation" +STACK);
    }
}
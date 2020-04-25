import java.util.*; 
  
public class StackDemoPush { 
    public static void main(String args[]) 
    { 
        Stack<String> STACK = new Stack<String>(); 
  
        STACK.push("Welcome"); 
        STACK.push("To"); 
        STACK.push("Geeks"); 
        STACK.push("For"); 
        STACK.push("Geeks"); 
  
        System.out.println("Initial Stack: " + STACK); 
  
        STACK.push("Hello"); 
        STACK.push("World"); 
  
        System.out.println("Final Stack: " + STACK); 
    } 
} 
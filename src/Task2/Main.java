<<<<<<< HEAD
package Task2;
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Welcome to the application!"); 
        // greetUser(); // Removed this line to introduce a bug 
    } 
 
    public static void greetUser() { 
        System.out.println("Hello, User!"); 
    } 
=======
package Task2;
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Welcome to the application!"); 
        greetUser(); 
    } 
    public static void greetUser() { 
        System.out.println("Hello, User!"); 
        System.out.println("How are you?"); 
    } 
>>>>>>> 11c0d3f0c99a92c55b3a4188316d02a70c705dd6
}
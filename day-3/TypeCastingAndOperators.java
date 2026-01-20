public class TypeCastingAndOperators {

    public static void main(String[] args) {

        // -------- Type Casting --------

        // Implicit Type Casting (Automatic)
        int a = 10;
        double b = a;   // int to double
        System.out.println("Implicit Casting:");
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        // Explicit Type Casting (Manual)
        double x = 12.75;
        int y = (int) x;   // double to int
        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + x);
        System.out.println("int value: " + y);

        // -------- Operators --------

        int num1 = 20;
        int num2 = 5;

        // Arithmetic Operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\nLogical Operators:");
        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(!condition1);
    }
}

// Write a program to perform arithmetic and bitwise operations in a single source program without object creation
public class Practicle_02{

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        // Arithmetic Operations
        int sum = a + b;
        int difference = a - b;
        int Multiplication = a * b;
        int Division = a / b;
        int Remainder = a % b;



        // Output results
        System.out.println("Arithmetic Operations:");
        System.out.println(a+" + "+b+" = "+ sum);
        System.out.println(a+" - "+b+" = "+ difference);
        System.out.println(a+" * "+b+" = "+ Multiplication);
        System.out.println(a+" / "+b+" = "+ Division);
        System.out.println(a+" % "+b+" = "+ Remainder);


        // Bitwise Operations
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int leftShift = a << 1;
        int rightShift = a >> 1;
        int bitwiseComplement = ~a;       

        System.out.println("\nBitwise Operations:");
        System.out.println("AND ("+a+" & "+b+") : " + and);
        System.out.println("OR ("+a+" || "+b+") : " + or);
        System.out.println("XOR ("+a+" ^ "+b+") : " + xor);
        System.out.println("Left Shift ("+a+" << "+b+") : " + leftShift);
        System.out.println("Right Shift ("+a+" >> "+b+") : " + rightShift);
        System.out.println("Bitwise Complement ( ~ "+a+") : " + bitwiseComplement);
    }
}

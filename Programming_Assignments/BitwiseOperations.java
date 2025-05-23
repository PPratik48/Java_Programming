package PSOOP;

public class BitwiseOperations {

	// Class that provides various bitwise operations
	

	    // Bitwise AND
	    public int bitwiseAnd(int a, int b) {
	        return a & b;
	    }

	    // Bitwise OR
	    public int bitwiseOr(int a, int b) {
	        return a | b;
	    }

	    // Bitwise XOR
	    public int bitwiseXor(int a, int b) {
	        return a ^ b;
	    }

	    // Bitwise NOT (only on one number)
	    public int bitwiseNot(int a) {
	        return ~(-a);
	    }

	    // Left Shift (a << n)
	    public int leftShift(int a, int n) {
	        return a << n;
	    }

	    // Right Shift (a >> n)
	    public int rightShift(int a, int n) {
	        return a >> n;
	    }

	    // Unsigned Right Shift (a >>> n)
	    public int unsignedRightShift(int a, int n) {
	        return a >>> n;
	    }
	

	// Main class to test the operations

	    public static void main(String[] args) {
	        BitwiseOperations bitwise = new BitwiseOperations();

	        // Example inputs
	        int a = 5, b = 28, shiftBy = 2;

	        // Performing and printing bitwise operations
	        System.out.println("Bitwise AND: " + a + " & " + b + " = " + bitwise.bitwiseAnd(a, b));
	        System.out.println("Bitwise OR: " + a + " | " + b + " = " + bitwise.bitwiseOr(a, b));
	        System.out.println("Bitwise XOR: " + a + " ^ " + b + " = " + bitwise.bitwiseXor(a, b));
	        System.out.println("Bitwise NOT: ~" + a + " = " + bitwise.bitwiseNot(a));
	        System.out.println("Left Shift: " + a + " << " + shiftBy + " = " + bitwise.leftShift(a, shiftBy));
	        System.out.println("Right Shift: " + a + " >> " + shiftBy + " = " + bitwise.rightShift(a, shiftBy));
	        System.out.println("Unsigned Right Shift: " + (-a) + " >>> " + shiftBy + " = " + bitwise.unsignedRightShift(-a, shiftBy));
	    }
	}

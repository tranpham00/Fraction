public class App {
    public static void main(String[] args) throws Exception {
        Fraction one = new Fraction(2, 6);
        Fraction two = new Fraction(1, 3);
        Fraction three = one.add(two);
    }
}

/*
 * need a class with two private instance data, numerator and denominator
 * need two constructors, without and with parameters to initialize
 * need a function to add fractions
 * - use given algorithm for LCM
 * need a function to multiply fractions
 * need a toString() to return the fraction properly
 * need a function to reduce the fraction (private/static function)
 * - need the given algorithm for GCD
 */
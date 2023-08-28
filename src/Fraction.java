public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
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
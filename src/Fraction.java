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

    private static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public int getNum()
    {
        return numerator;
    }

    public int getDen()
    {
        return denominator;
    }

    public Fraction add(Fraction other)
    {
        int LCM = lcm(this.denominator, other.getDen());
        int firstNum = this.numerator * LCM;
        int secondNum = other.getNum() * LCM;
        numerator = firstNum + secondNum;
        denominator = LCM;
        Fraction newFrac = new Fraction(numerator, denominator);
        newFrac.reduce();
        return newFrac;
    }
/* 
    public Fraction multiply(Fraction other)
    {

    }

    public String toString()
    {

    }*/

    private void reduce()
    {
        int GCD = gcd(numerator, denominator);
        numerator /= GCD;
        denominator /= GCD;
    }
}

/*
 *
 * need a function to add fractions
 * need a function to multiply fractions
 * need a toString() to return the fraction properly
 * need a function to reduce the fraction (private/static function)
 */
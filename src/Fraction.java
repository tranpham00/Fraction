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

    public Fraction add(Fraction other)
    {
        int LCM = lcm(this.denominator, other.denominator);
        int first = LCM / this.denominator;
        int second = LCM / other.denominator;
        int num = ((first * this.numerator) + (second * other.numerator));
        Fraction newFrac = new Fraction(num, LCM);
        newFrac.reduce();
        return newFrac;
    }

    public Fraction multiply(Fraction other)
    {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        Fraction newFrac = new Fraction(num, den);
        newFrac.reduce();
        return newFrac;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

    private void reduce()
    {
        int GCD = gcd(numerator, denominator);
        this.numerator /= GCD;
        this.denominator /= GCD;
    }
}
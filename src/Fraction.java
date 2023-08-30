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
        int firstCommon = this.denominator / LCM;
        int firstNum = this.numerator * firstCommon;
        int secondCommon = other.getDen() / LCM;
        int secondNum = other.getNum() * secondCommon;
        int num = firstNum + secondNum;
        int den = LCM;
        Fraction newFrac = new Fraction(num, den);
        newFrac.reduce();
        return newFrac;
    }

    public Fraction multiply(Fraction other)
    {
        int num = this.numerator * other.getNum();
        int den = this.denominator * other.getDen();
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
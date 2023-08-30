public class App {
    public static void main(String[] args) throws Exception {
        Fraction one = new Fraction(1, 6);
        Fraction two = new Fraction(1, 6);
        System.out.println(one.toString());
        Fraction three = one.add(two);
        System.out.println(three.toString());
        Fraction four = one.multiply(two);
        System.out.println(four.toString());
    }
}
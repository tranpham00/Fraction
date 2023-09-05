public class App {
    public static void main(String[] args) throws Exception {
        Fraction one = new Fraction(1, 3);
        Fraction two = new Fraction(1, 6);
        Fraction three = one.add(two);
        System.out.println("1/3 + 1/6 is supposed to be 1/2 and is " + three.toString());
        Fraction four = one.multiply(two);
        System.out.println("1/3 * 1/6 is supposed to be 1/18 and is " + four.toString());

        Fraction five = new Fraction(1, 4);
        Fraction six = new Fraction(3, 6);
        Fraction seven = five.add(six);
        System.out.println("1/4 + 3/6 is supposed to be 3/4 and is " + seven.toString());
        Fraction eight = five.multiply(six);
        System.out.println("1/4 + 3/6 is supposed to be 1/8 and is " + eight.toString());

        Fraction nine = new Fraction(3, 8);
        Fraction ten = new Fraction(2, 5);
        Fraction eleven = nine.add(ten);
        System.out.println("3/8 + 2/5 is supposed to be 31/40 and is " + eleven.toString());
        Fraction twelve = nine.multiply(ten);
        System.out.println("3/8 + 2/5 is supposed to be 3/20 and is " + twelve.toString());
    }
}
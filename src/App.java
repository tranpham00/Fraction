public class App {
    public static void main(String[] args) throws Exception {
        Fraction one = new Fraction(1, 3);
        Fraction two = new Fraction(1, 6);
        Fraction three = one.add(two);
        System.out.println(one + " + " + two + " = " + three.toString());
        Fraction four = one.multiply(two);
        System.out.println(one + " * " + two + " = " + four.toString());

        Fraction five = new Fraction(1, 4);
        Fraction six = new Fraction(3, 6);
        Fraction seven = five.add(six);
        System.out.println(five + " + " + six + " = " + seven.toString());
        Fraction eight = five.multiply(six);
        System.out.println(five + " * " + six + " = " + eight.toString());

        Fraction nine = new Fraction(3, 8);
        Fraction ten = new Fraction(2, 5);
        Fraction eleven = nine.add(ten);
        System.out.println(nine + " + " + ten + " = " + eleven.toString());
        Fraction twelve = nine.multiply(ten);
        System.out.println(nine + " * " + ten + " = " + twelve.toString());
    }
}
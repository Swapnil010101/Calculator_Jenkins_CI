public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        assert calc.add(2,3) == 5 : "Addition Test Failed";
        assert calc.subtract(5,3) == 2 : "Subtraction Test Failed";
        assert calc.multiply(2,3) == 6 : "Multiplication Test Failed";
        assert calc.divide(6,3) == 2 : "Division Test Failed";

        System.out.println("All Tests Passed Successfully!");

    }
}

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        int division = firstNumber/secondNumber; // 0,66
        int mod = secondNumber%firstNumber; // ile 4 mieści się w 6 mieści się w 1 = 2

        System.out.println("Wynik dodawania "+ addition);
        System.out.println("Odejmowanie "+ subtraction);
        System.out.println("Mnożenie "+ multiplication);
        System.out.println("Dzielenie "+ division);
        System.out.println("Modulo "+ mod);

    }
}

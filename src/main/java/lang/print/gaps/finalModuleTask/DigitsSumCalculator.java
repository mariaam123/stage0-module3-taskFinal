package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int digit1 = (number/1000)%10; // 1.234%10 = 1
        int digit2 = (number / 100) % 10; //12% = 2
        int digit3 = (number / 10) % 10; //123%10 = 3
        int digit4 = number % 10; //1234% = 4

        int digitsum = digit1 + digit2 + digit3 + digit4;
        System.out.println(digitsum);

    }

    public static void main(String[] args) {
        DigitsSumCalculator sumCalculator = new DigitsSumCalculator();
        int number = 1234;
        sumCalculator.calculateSum(number);
    }
}

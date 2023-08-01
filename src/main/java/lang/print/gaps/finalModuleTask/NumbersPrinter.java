package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {

        boolean num = number > 0;
        System.out.println(num);
    }
    public static void main(String[] args) {
        NumbersPrinter whenIsZero = new NumbersPrinter();
        int number = 1;
        whenIsZero.printIsPositive(number);
    }
}
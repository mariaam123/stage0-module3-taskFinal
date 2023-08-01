package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int digit1 = number % 10; // 489%10 = 9
        int digit2 = (number /10) % 10; // 48%10 = 8
        int digit3 = (number/100) % 10; // 4%10 = 4

        int reverted = (digit1)*100 + (digit2)*10 + digit3;

         System.out.println(reverted);
    }

}

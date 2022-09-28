package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result;
        result = number % 10;
        result += number / 10 % 10;
        result += number / 100 % 10;
        result += number / 1000;
        System.out.println(result);
    }
}

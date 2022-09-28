package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result;
        result = number % 10 * 100;
        result += number % 10 * 10;
        result += number % 10;
        System.out.println(result);
    }
}

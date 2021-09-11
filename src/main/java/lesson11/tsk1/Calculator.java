package lesson11.tsk1;

public class Calculator {
    public static int getsum(int... arguments) {
        if (arguments == null) {
            throw new RuntimeException("Не передано аргументов для выполнения операции");
        }
        int sum = 0;
        for (int argument : arguments) {
            sum += argument;

        }
        return sum;
    }

    public static int getMultiplication(int... arguments) {
        if (arguments == null) {
            throw new RuntimeException("Не передано аргументов для выполнения операции");
        }
        int product = 1;
        for (int argument : arguments) {
            product *= argument;

        }
        return product;

    }
}

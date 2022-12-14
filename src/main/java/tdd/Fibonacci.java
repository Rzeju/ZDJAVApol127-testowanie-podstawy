package tdd;

public class Fibonacci {
    public static int getValue(int element) {
        if (element == 0) {
            return 0;
        }

        if (element == 1) {
            return 1;
        }

        if (element == 2) {
            return 1;
        }

        int result = 0;
        int position1 = 1;
        int position2 = 1;

        if (element > 2) {
            for (int i = 3; i <= element; i++) {
                result = position1 + position2;
                position2 = position1;
                position1 = result;
            }
        }

        return result;
    }

    public static int rafactoredMethod(int element) {
        if (element == 0) {
            return 0;
        }
        if (element == 1 || element == 2) {
            return 1;
        }

        return rafactoredMethod(element - 1) + rafactoredMethod(element - 2);
    }
}

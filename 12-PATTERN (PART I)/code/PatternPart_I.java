public class PatternPart_I {

    // PRINT STAR PATTERN
    public static void printStarPattern() {
        // one Line
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // PRINT INVERTED STAR PATTERN
    public static void invertedStarPattern() {

        int n = 4;
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= (4 - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // PRINT HALF PYRAMID PATTER
    public static void halfPyramidPattern() {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            // print numbers
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    // PRINT CHARACTER PATTERN
    public static void characterPattern() {
        char ch = 'A';
        int n = 6;

        // outer loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printStarPattern();
        // invertedStarPattern();
        // halfPyramidPattern();
        characterPattern();

    }
}
package Akbar_MohammadAbeer_u2253319.Practical_20;
import java.util.Scanner;
public class SierpinskiCarpet {
    // 2D array to store the carpet pattern
    static char[][] pattern;
    int size;

    /**
     * Recursive function to generate the Sierpinski carpet pattern
     * @param pattern 2D array to store the pattern
     * @param startRow starting row index of the sub-carpet
     * @param startCol starting column index of the sub-carpet
     * @param size size of the sub-carpet
     */
    public static void generatePattern(char[][] pattern, int startRow, int startCol, int size) {
        // Base case: if the size of the sub-carpet is 1, set the character at position (startRow, startCol) to '*'
        if (size == 1) {
            pattern[startRow][startCol] = '*';
            return;
        }

        // Recursively generate the eight sub-carpets
        int subSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sr = startRow + i * subSize;
                int sc = startCol + j * subSize;
                // Skip the center sub-carpet
                if (i == 1 && j == 1) continue;
                generatePattern(pattern, sr, sc, subSize);
            }
        }
    }

    /**
     * Print the pattern to the console
     * @param pattern 2D array storing the pattern
     */
    public static void printPattern(char[][] pattern) {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[0].length; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Constructor for the SierpinskiCarpetGenerator class
     * @param pattern 2D array to store the pattern
     */
    public SierpinskiCarpet(char[][] pattern) {
        this.pattern = pattern;
        this.size = pattern.length;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a size for the Sierpinski carpet
        System.out.print("What size Sierpinski carpet would you like to generate? (Enter 'q' to exit program) : ");
        String input = sc.nextLine();

        // Keep asking the user for input until they enter 'q'
        while (!input.equals("q")) {
            // Parse the input as an integer
            int size = Integer.parseInt(input);

            // Initialize the carpet pattern with spaces
            pattern = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    pattern [i][j] = ' ';
                }
            }

            // Create a SierpinskiCarpetGenerator object and generate the pattern
            SierpinskiCarpet generator = new SierpinskiCarpet(pattern);
            generator.generatePattern(pattern, 0, 0, size);

            // Print the resulting pattern to the console
            printPattern(pattern);

            // Ask the user for another input
            System.out.print("Enter the size of the Sierpinski carpet pattern you want to generate or 'q' to quit: ");
            input = sc.nextLine();
        }
    }
}
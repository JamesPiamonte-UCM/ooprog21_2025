// Display every character between Unicode 65 and 122
// Start new line after 20 characters
import java.util.Scanner;

public class DebugSix2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int a;
        final int MAX = 122;
        final int NUMBERLINE = 20;
        int lines = 0; // start at 0 so counting works properly

        System.out.println("Enter a Unicode value to start.");
        System.out.print("For example, A is 65 >> ");
        int min = keyboard.nextInt();

        // Loop through Unicode characters
        for (a = min; a <= MAX; a++)
        {
            letter = (char) a;
            System.out.print(" " + letter);
            lines++;

            // after 20 characters, start a new line
            if (lines == NUMBERLINE)
            {
                System.out.println();
                lines = 0;
            }
        }

        System.out.println("\nEnd of application");
    }
}

// This class uses a DebugPen class 
// to instantiate two Pen objects 
// One with default values 
// and the other with user-supplied values
import java.util.Scanner;
public class DebugFour2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String color;
        String point;

        DebugPen pen1;
        DebugPen pen2;

        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();

        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

        // One pen with default values
        pen1 = new DebugPen();

        // Another pen with user-supplied values
        pen2 = new DebugPen(color, point);

        System.out.println("Default value pen:");
        display(pen1);

        System.out.println("User value pen:");
        display(pen2);

        input.close();
    }

    public static void display(DebugPen p)
    {
        System.out.println(" The pen has ink color " + p.getColor());
        System.out.println(" and a " + p.getPoint() + " point.");
    }
}


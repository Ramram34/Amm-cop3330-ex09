import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double wallArea;
        double width;
        double length;
        double paintQuantity;

        System.out.println("Please enter the width of the room in feet:");
        width = in.nextDouble();

        System.out.println("Please enter the length of the room in feet:");
        length = in.nextDouble();

        wallArea = width * length;

        paintQuantity = wallArea * 2 / 350;

        System.out.println("You will need to purchase " + Math.ceil(paintQuantity) +
                " gallons of paint to cover " + wallArea + " square feet.");
    }
}

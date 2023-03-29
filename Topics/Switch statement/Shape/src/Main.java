import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int square = 1, circle = 2, triangle = 3, rhombus = 4;

        int numOfShape = scanner.nextInt();
        switch (numOfShape) {
            case square:
                System.out.println("You have chosen a square");
                break;
            case circle:
                System.out.println("You have chosen a circle");
                break;
            case triangle:
                System.out.println("You have chosen a triangle");
                break;
            case rhombus:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int move = scanner.nextInt();
        final int up = 1;
        final int down = 2;
        final int left = 3;
        final int right = 4;
        final int dontMove = 0;
        switch (move){
            case up:
                System.out.println("move up");
                break;
            case down:
                System.out.println("move down");
                break;
            case left:
                System.out.println("move left");
                break;
            case right:
                System.out.println("move right");
                break;
            case dontMove:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}
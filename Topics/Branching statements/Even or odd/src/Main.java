import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        while (a != 0) {
            System.out.println(a % 2 == 0 ? "even" : "odd");
            a = scanner.nextInt();
        }
    }
}
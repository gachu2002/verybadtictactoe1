import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int num : a) {
            if (num > n) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
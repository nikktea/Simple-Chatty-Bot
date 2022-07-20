import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int end = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                end++;
            }
        }
        System.out.println(end);
    }
}
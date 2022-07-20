import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int a = 1;
        final int b = 2;
        final int c = 3;

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.print(((n + a) * n + b) * n + c);
    }
}

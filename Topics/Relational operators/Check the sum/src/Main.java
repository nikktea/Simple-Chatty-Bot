import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        final int f = 20;

        boolean d = a + b == f;
        boolean d1 = a + c == f;
        boolean d2 = b + c  == f;

        System.out.println(d || d1 || d2);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        final int magicNum = 10;

        System.out.println((magicNum > a) & (a > 0));
    }
}
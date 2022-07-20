import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int a = 0;

        for (int i = 1; i < number; i++) {
            a = scanner.nextInt();
            if (a / 6 == 0){
                if (sum < a) {
                    sum = a;
                }
            }
            System.out.println(sum);
        }
    }
}
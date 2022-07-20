import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String experience = scanner.next();
        String fusion = scanner.next();

        System.out.print("The form for " + name + " is completed. We will contact you if we need a chef who cooks ");
        System.out.print(fusion + " dishes and has " + experience + " years of experience.");
    }
}
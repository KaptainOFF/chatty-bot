import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        while (scanner.hasNextInt()) {
            System.out.print(scanner.nextInt() - 1 + " ");
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int val = scanner.nextInt();
        boolean result = false;
        if (val > 0 && val < 10) {
            result = true;
        }
        System.out.println(result);
    }
}
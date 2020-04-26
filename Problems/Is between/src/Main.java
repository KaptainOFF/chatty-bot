import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = false;
        if(b == c) {
            if (a == b) {
                result = true;
            }
        } else if( b > c) {
            if (a >= c && a <= b) {
                result = true;
            }
        } else {
            if (a >= b && a <= c) {
                result = true;
            }
        }
        System.out.println(result);
    }
}
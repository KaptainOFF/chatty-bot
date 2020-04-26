import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        if(number.length() < 4) {
            System.out.println("7");
        } else {
            if(number.charAt(0) == number.charAt(number.length()-1)
                    && number.charAt(1) == number.charAt(2)) {
                System.out.println(1);
            } else {
                System.out.println(7);
            }
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int result = 0;
        switch (number) {
            case "one":
                result = 1;
                break;
            case "two":
                result = 2;
                break;
            case "three":
                result = 3;
                break;
            case "four":
                result = 4;
                break;
            case "five":
                result = 5;
                break;
            case "six":
                result = 6;
                break;
            case "seven":
                result = 7;
                break;
            case "eight":
                result = 8;
                break;
            case "nine":
                result = 9;
                break;
        }
        System.out.println(result);
    }
}
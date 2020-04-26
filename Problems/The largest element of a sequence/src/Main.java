import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = Integer.MIN_VALUE;
        while(scanner.hasNextInt()) {
            int nextNumber = scanner.nextInt();
            if(nextNumber == 0) {
                break;
            } else {
                if(number < nextNumber) {
                    number = nextNumber;
                }
            }
        }
        System.out.println(number);
    }
}
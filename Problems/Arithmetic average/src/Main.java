import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int amount = 0;
        double counter = 0.0;
        for (int i = start; i <= end; i++) {
            if(i % 3 ==0) {
                amount += i;
                counter++;
            }
        }
        System.out.println(amount / counter);
    }
}
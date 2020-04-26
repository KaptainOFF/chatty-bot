import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int counter = 0;
        double money = m;
        while (money < k) {
            money +=  (money * p)/100.0;
            counter++;
        }
        System.out.println(counter);
    }
}
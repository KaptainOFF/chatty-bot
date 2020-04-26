import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;
        List<Integer> numbers = new ArrayList<>();
        while(scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 4 == 0 && numbers.get(i) > maxNum) {
                maxNum = numbers.get(i);
            }
        }
        System.out.println(maxNum);
    }
}
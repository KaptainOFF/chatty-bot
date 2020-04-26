import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        numbers.remove(numbers.size() -1 );
        boolean answer = true;
        for (int i = 0; i < numbers.size() - 2; i++) {
            int current = numbers.get(i);
            int next = numbers.get(i + 1);
            int third = numbers.get(i + 2);
            if(!(current <= next && next <= third)) {
                if(!(current>= next && next >= third)) {
                    answer = false;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int totalDesks = 0;
        while (scanner.hasNextInt()) {
            int studentsInRoom = scanner.nextInt();
            if (studentsInRoom % 2 != 0) {
                studentsInRoom++;
            }
            totalDesks += studentsInRoom / 2 ;
        }
        System.out.println(totalDesks);
    }

}

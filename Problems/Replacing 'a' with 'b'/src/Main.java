import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String out = "";
        for(char letter : scanner.next().toCharArray()) {
            if (letter == 'a') {
                letter = 'b';
            }
            out += letter;
        }
        System.out.println(out);
    }
}
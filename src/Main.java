import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a main phrase:");
        String phrase = read.nextLine();

        System.out.println("Enter the substring:");
        int substring = read.nextInt();

        if (phrase.length() < substring) {
            System.out.println("Error! Index is larger than length!");
        } else {
            System.out.println(phrase.substring(0, substring));
        }
    }
}

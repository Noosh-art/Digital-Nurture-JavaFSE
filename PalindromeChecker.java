import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        text = text.replaceAll(
                "[^a-zA-Z0-9]",
                ""
        ).toLowerCase();

        String reverse =
                new StringBuilder(text)
                        .reverse()
                        .toString();

        if(text.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
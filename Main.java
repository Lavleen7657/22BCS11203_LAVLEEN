import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, specialCharacters = 0;
        String lowercaseInput = s.toLowerCase();
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char ch = lowercaseInput.charAt(i);

            if (Character.isDigit(ch)) {
                digits++; 
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isWhitespace(ch)) {
                specialCharacters++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
    }
}

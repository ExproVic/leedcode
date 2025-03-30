import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of words:");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];


        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }


        String longestCommonPrefix = findLongestCommonPrefix(words);

        if (!longestCommonPrefix.isEmpty()) {
            System.out.println("Longest common prefix in all words: '" + longestCommonPrefix + "'");
        } else {
            System.out.println("No common prefix found.");
        }
    }

    private static String findLongestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {

            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

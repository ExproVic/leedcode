package palindromelist;

import java.util.Scanner;
public class Palindromelist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scanner.nextInt(); 
        scanner.close(); 

        Solution solution = new Solution();
        if (solution.isPalindrome(number)) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " isn`t palindrome");
        }
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
/*
 * 6. Write a program to check if the letter ‘e’ is present in the word umbrella?
 */

class CheckPresence {
    public boolean check(String str, char ch) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == ch) {
                return true;
            }
        }
        return false;
    }
}

public class LetterPresent {
    public static void main(String[] args) {
        CheckPresence ck = new CheckPresence();
        String str = "umbrella";
        char ch = 'e';
        System.out.println(ck.check(str, ch));
    }
}

/*
 * 2.Write a java program to know whether the given string is palindrome
 */

class Palindrome{
    boolean palindromeString(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        Palindrome pa = new Palindrome();
        String str1 = "level";
        System.out.println(pa.palindromeString(str1));
        String str2 = "skill";
        System.out.println(pa.palindromeString(str2));
    }
}

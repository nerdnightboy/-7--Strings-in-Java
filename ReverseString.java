/*
 * 1.Write a java program to Reverse a string without using the inbuilt method.
 */

class Reverse{
    public String reverseStr(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        String str2 = new String(arr);
        return str2;
    }
}

public class ReverseString{
    public static void main(String []args){
        Reverse re = new Reverse();
        String str1 = "World";
        System.out.println(re.reverseStr(str1));
    }
}
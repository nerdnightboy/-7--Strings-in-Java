/*
 * 2 - WAP to reverse a string.
Input - “PWSKILLS”
Output - “SLLIKSWP”

 */

class ReversePW{
    public String reversePWStr(String str){
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

public class ReversePWSKILLS{
    public static void main(String []args){
        ReversePW reverse = new ReversePW();
        String str1 = "PWSKILLS";
        System.out.println(reverse.reversePWStr(str1));
    }
}

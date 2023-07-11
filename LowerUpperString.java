/*
 * 3.Write a java program to convert upper case to lower case and vice versa.
 */

class LowerUpper{
    public String caseReverseStr(String str){
        char[] arr = str.toCharArray();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
            }
            else{
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        String str2 = new String(arr);
        return str2;
    }
}

public class LowerUpperString {
    public static void main(String[] args) {
        LowerUpper lwup = new LowerUpper();
        String str1 = "Hello World";
        System.out.println(lwup.caseReverseStr(str1));
    }
}

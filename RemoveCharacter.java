/*
 * 4.Write a java program to remove a particular character from a String.
 */

class Remove{
    public StringBuffer removeChar(String str, char ch){
        char[] arr = str.toCharArray();
        int n = arr.length;
        StringBuffer str2 = new StringBuffer();

        for(int i = 0; i < n; i++){
            if(arr[i] != ch){
                str2.append(arr[i]);
            }
        }
        
        return str2;
    }
}

public class RemoveCharacter {
    public static void main(String[] args) {
        Remove re = new Remove();
        String s = "Halloween";
        char ch = 'l';
        System.out.println(re.removeChar(s,ch));
    }
}

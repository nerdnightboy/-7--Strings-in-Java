/*
 * 4. WAP to sort a String Alphabatically
 */
import java.util.Arrays;

class Sort{
    public String sortAlphaletters(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String result = new String(arr);
        return result;
    }
}


public class SortAlphabetically {
    public static void main(String[] args) {
        Sort sort = new Sort();
        String str = "runnigfast";
        System.out.println(sort.sortAlphaletters(str));
    }
}

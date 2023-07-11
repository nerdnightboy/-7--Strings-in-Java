/*
 * 5.Write a java program to find the index of a substring.
 */
class Index{
    public int substringIndex(String str, String substr){
        int index;
        index = str.indexOf(substr);
        return index;
    }
}

public class SubstringIndex {
    public static void main(String[] args) {
        Index idx = new Index();
        String str = "How are you?";
        String substr = "are";
        System.out.println(idx.substringIndex(str,substr));
    }
}

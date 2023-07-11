/*
 * WAP to reverse a sentence while preserving the position.
Input - “Think Twice”
Output - “knihT eciwT”
 */

class Preserve{
    public String preserveReverse(String str){
        String[] split = str.split(" ");
        int n = split.length;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            StringBuffer sb1 = new StringBuffer(split[i]);
            sb1.reverse();
            sb.append(sb1);
            sb.append(" ");
        }
        return sb.toString();
    }
}

public class PreserveReverse {
    public static void main(String[] args) {
        Preserve pre = new Preserve();
        String str ="Think Twice";
        System.out.println(pre.preserveReverse(str));
    }
}

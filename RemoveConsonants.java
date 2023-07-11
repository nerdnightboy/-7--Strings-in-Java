/*
 * 7. Write a program to delete all consonants from the string “Hello, have a good day”.
 */

 class Consonants{
    public String removeAllConso(String str){
        return str.replaceAll("[^aeiouAEIOU,\\s]", "");
    }
 }

public class RemoveConsonants{
    public static void main(String[] args){
        Consonants cons = new Consonants();
        String str = "Hello, have a good day";
        System.out.println(cons.removeAllConso(str));
    }
}
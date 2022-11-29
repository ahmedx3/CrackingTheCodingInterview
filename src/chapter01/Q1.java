package chapter01;

public class Q1 {

    static Boolean isUnique(String word) {

        String wordUpper = word.toLowerCase();
        Boolean[] foundArr = new Boolean[128];

        for (char ch: wordUpper.toCharArray()) {
            if (foundArr[(int)ch] != null) {
                return false;
            }else {
                foundArr[(int)ch] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "Unique";
        String test2 = "Ahmed";

        System.out.println( isUnique(test1) );
        System.out.println( isUnique(test2) );
    }
}

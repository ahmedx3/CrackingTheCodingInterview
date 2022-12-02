package chapter01;

import java.util.Arrays;

public class Q2 {

    static boolean isPermutation(String str1 , String str2) {

        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();

        int[] str1Freq = new int[128];
        int[] str2Freq = new int[128];

        if ( str1Lower.length() != str2Lower.length() ) {
            return false;
        }

        for (char ch: str1Lower.toCharArray()) {
            str1Freq[(int)ch]++;
        }

        for (char ch: str2Lower.toCharArray()) {
            str2Freq[(int)ch]++;
        }

        return Arrays.equals(str1Freq, str2Freq);
    }

    public static void main(String[] args) {
        String test1 = "Ahmed";
        String test2 = "Maedh";

        System.out.println(isPermutation(test1,test2));
    }

}

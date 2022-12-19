package chapter01;

public class Q3 {
    static void URLify(char[] word, int len) {
        int actualLen = len;
        for(int i = 0; i < word.length ; i++) {
            if(word[i] == ' ') {
                for(int j = actualLen-1; j > i; j--) {
                    word[j+2] = word[j];
                }
                actualLen += 2;
                word[i] = '%';
                word[i+1] = '2';
                word[i+2] = '0';
            }
        }

        System.out.println(word);

        return;
    }

    public static void main(String[] args) {
        char[] test1 = "Mr John Smith    ".toCharArray();
        URLify(test1,13);
    }
}

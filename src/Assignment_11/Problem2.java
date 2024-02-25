package Assignment_11;

public class Problem2 {
public static void main(String[] args) {
        String input = "my favourite cricker is yuvraj singh";
        int wordCount = countWords(input);
        System.out.println("Word count: " + wordCount);
    }

    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
}
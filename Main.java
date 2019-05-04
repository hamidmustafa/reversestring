
import java.io.*;

public class Main {

   private static String inputString;
   private static BufferedReader bufferedReader;
   private static String reversedString;

    public static void main(String[] args) {

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputString = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        reversedString = reverseString(inputString);
        System.out.println(reversedString);

    }

    public static String reverseString(String inputString) {

        String reversedString_ = "";
        int lengthOfInputString = inputString.length();
        for(int i = lengthOfInputString - 1 ; i >= 0 ; i--) {
            char indexValue = inputString.charAt(i);
            reversedString_ = reversedString_ + indexValue;
        }

        return reversedString_;
    }
}

package Helper;

import java.util.Base64;

public class Encoder {
    public static String encode(String plainString) {
        String encodedString;

        byte[] plainStringBytes = plainString.getBytes();
        encodedString = Base64.getEncoder().encodeToString(plainStringBytes);

        return encodedString;
    }

    public static void printEncodedPlainText(String plainString) {
        System.out.println(encode(plainString));
    }
}

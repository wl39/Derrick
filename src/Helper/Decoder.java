package Helper;

import java.util.Base64;

public class Decoder {
    public static String decode(String base64String) {
        String decodedString;

        byte[] inputStringBytes = Base64.getDecoder().decode(base64String);
        decodedString = new String(inputStringBytes);

        return decodedString;
    }

    public static void printDecodedPlainText(String base64String) {
        System.out.println(decode(base64String));
    }

    public static String decodeWithPrivateKey(String base64String, String privateKey) {
        String password = base64String + privateKey;
        return decode(password);
    }

    public static void printDecodeWithPrivateKey(String base64String, String privateKey) {
        System.out.println(decodeWithPrivateKey(base64String, privateKey));
    }
}

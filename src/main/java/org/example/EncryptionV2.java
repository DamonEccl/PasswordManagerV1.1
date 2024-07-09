package org.example;
import java.util.Map;
import java.util.Map;

public class EncryptionV2 {

    private static final String SRC_ALPHABET =
            "!@#$%^&*()ABCDEFGHIJKLMNOPQRSTUVWXYZ__abcdefghijklmnopqrstuvwxyz1234567890,./?";

    private static final String DST_ALPHABET =
            ",./?1234567890mnopqrstuvwxyzabcdefghijkl__MNOPQRSTUVWXYZABCDEFGHIJKL!@#$%^&*()";

    public static String Encode(String word){
        String encode;
        int i = 0;

        char[] characterArray = word.toCharArray();
        String[] newChar = new String[characterArray.length];

        for (char c : characterArray) {

            int offset = c - SRC_ALPHABET.charAt(0);
            if (offset >= 0 && offset < DST_ALPHABET.length()) {
                char dest = DST_ALPHABET.charAt(offset);
                if (dest != '_') {
                    newChar[i] = String.valueOf(dest);
                    i++;
                }
            }
        }
        encode = String.join("", newChar);
        System.out.println(encode);


        return encode;
    }



}

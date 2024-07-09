package org.example;

import java.util.HashMap;
import java.util.Map;

public class Encryption {

    public static Map<String, String> letters = new HashMap<>();
    public static Map <String, String> invertedLetters = new HashMap<>();
    public static boolean isInitialized = false;


    public static void loadLetters(){

        if (!isInitialized) {
            letters.put("!", "w");
            letters.put("#", "Y");
            letters.put("$", "#");
            letters.put("%", "C");
            letters.put("&", "h");
            letters.put("(", "x");
            letters.put(")", "%");
            letters.put("*", "E");
            letters.put("+", "Z");
            letters.put("-", "g");
            letters.put(":", "$");
            letters.put("?", "I");
            letters.put("@", "@");
            letters.put("A", "-");
            letters.put("B", "L");
            letters.put("C", "*");
            letters.put("D", "a");
            letters.put("E", "n");
            letters.put("F", "f");
            letters.put("G", "B");
            letters.put("H", "A");
            letters.put("I", "v");
            letters.put("J", "N");
            letters.put("K", "M");
            letters.put("L", "G");
            letters.put("M", "O");
            letters.put("N", "Q");
            letters.put("O", "&");
            letters.put("P", "e");
            letters.put("Q", "P");
            letters.put("R", "T");
            letters.put("S", "[");
            letters.put("T", "p");
            letters.put("U", "H");
            letters.put("V", "V");
            letters.put("W", "d");
            letters.put("X", "s");
            letters.put("Y", "k");
            letters.put("Z", "]");
            letters.put("[", "(");
            letters.put("]", ":");
            letters.put("^", "+");
            letters.put("a", "u");
            letters.put("b", "q");
            letters.put("c", "c");
            letters.put("d", "W");
            letters.put("e", "y");
            letters.put("f", "K");
            letters.put("g", "j");
            letters.put("h", "r");
            letters.put("i", "m");
            letters.put("j", "X");
            letters.put("k", "l");
            letters.put("l", "!");
            letters.put("m", "z");
            letters.put("n", "?");
            letters.put("o", "U");
            letters.put("p", "^");
            letters.put("q", "J");
            letters.put("r", "i");
            letters.put("s", "b");
            letters.put("t", "R");
            letters.put("u", "F");
            letters.put("v", ")");
            letters.put("w", "o");
            letters.put("x", "t");
            letters.put("y", "D");
            letters.put("z", "S");
        }
        isInitialized = true;



        for (Map.Entry<String, String> entry : letters.entrySet()) {
            invertedLetters.put(entry.getValue(), entry.getKey());

        }

    }

    public static String Encode(String word){
        String encode = "";

        loadLetters();

        System.out.println(word);
        char[] characterArray = word.toCharArray();
        String[] newChar = new String[characterArray.length];
        int i = 0;

        for (char letter : characterArray){
            String temp = "" + letter;
            if (letters.get(temp) != null){
                newChar[i] = letters.get(temp);
            }

            else{
                newChar[i] = temp;
            }
            i++;
        }

        encode = String.join("", newChar);
        System.out.println(encode);

        return encode;
    }

    public static String Decode(String word){
        String decode = "";


        loadLetters();

        System.out.println(word);
        char[] characterArray = word.toCharArray();
        String[] newChar = new String[characterArray.length];
        int i = 0;

        for (char letter : characterArray){
            String temp = "" + letter;
            if (invertedLetters.get(temp) != null){
                newChar[i] = invertedLetters.get(temp);
            }

            else{
                newChar[i] = temp;
            }
            i++;
        }

        decode = String.join("", newChar);
        System.out.println(decode);

        return decode;
    }


}
package com.zipcodewilmington.assessment1.part1;
import java.lang.Character;
/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String firstLetter = str.substring(0,1).toUpperCase();
        String restOfString = str.substring(1, str.length());

        return firstLetter + restOfString;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        //String[] characterArray = str.split("");
        return sb.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedString = reverse(str);
        String reversedCamel = camelCase(reversedString);

        return reversedCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        StringBuilder sb = new StringBuilder(str);
        int lastLetterIndex = str.length();
        sb.replace(lastLetterIndex-1, lastLetterIndex, "");
        sb.replace(0,1,"");
        return sb.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

       /* char[] characterArray = str.toCharArray()
                for (int i=0; i < characterArray.length; i++)
                    if (characterArray[i]))

        */
        return null;
    }
}

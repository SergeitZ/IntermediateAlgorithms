package com.company;


public class SpecialReverseString {

    public static String specialReverseString(String str) {

        String rts = new StringBuilder(str).reverse().toString().toLowerCase();

        String noSpaces = rts.replaceAll(" ", "");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                noSpaces = noSpaces.substring(0, i) + " "  + noSpaces.substring(i);
            }
        }

        rts = noSpaces;

        for (int i = 0; i < rts.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char temp = Character.toUpperCase(rts.charAt(i));
                StringBuilder temp2 = new StringBuilder(rts);
                temp2.setCharAt(i, temp);
                rts = temp2.toString();
            }
        }
        return rts;

    }
}


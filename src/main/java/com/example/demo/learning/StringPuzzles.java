package com.example.demo.learning;

public class StringPuzzles {
    public static void main(String[] args) {

        String s = "unni";
        StringBuffer sb = new StringBuffer(s);

        //Get last two characters as string
        sb.replace(0, 1, "sunil");

        System.out.println("Result: " + sb);
    }

    String replaceCharacterWithAnotherCharacter(String s) {
        return "";
    }
}

package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class App {

    public static boolean scrabble(String characters, String word) {
    characters = characters.toLowerCase();
    word = word.toLowerCase();

    int[] characterCount = new int[26];

    for(char c : characters.toCharArray()){
        characterCount[c - 'a']++;
    }
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (characterCount[index] > 0) {
                characterCount[index]--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(scrabble("rkqodlw", "world")); // true
        System.out.println(scrabble("ajv", "java")); // false
        System.out.println(scrabble("avjafff", "JaVa")); // true
        System.out.println(scrabble("", "hexlet")); // false
    }
//END
}
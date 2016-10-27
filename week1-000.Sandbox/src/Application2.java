
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anastasia
 */

/* TASK: The user inputs the words until empty string . 
 * You need to print the largest word out of all input.
 */

public class Application2 {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();       
        System.out.println("Insert a word: ");

        while (true) {
            String word = reader.nextLine();

            if (word.equals("")) {
                break;
            } else {
                words.add(word);
            }
        }

        int[] lengths;
        lengths = storeNumberOfLetters(words);
        int biggest = findTheBiggestNumber(lengths);
        int index = findTheIndexOfTheBiggestNumber (lengths, biggest);
        String longestWord = getTheLongestWord (words, index);
        
        System.out.println("The longest word: " + longestWord);
    }

    public static int[] storeNumberOfLetters(ArrayList<String> words) {
        int[] lengths = new int[words.size()];

        for (int i = 0; i < words.size(); i++) {
            int length = words.get(i).length();
            lengths[i] = length;
        }
        return lengths;
    }

    public static int findTheBiggestNumber(int[] array) {
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > biggest) {
                biggest = array[i];
            }
            
        }
        return biggest;
    }
    
    public static int findTheIndexOfTheBiggestNumber (int[] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        return index;
    }
    
    
    public static String getTheLongestWord(ArrayList<String> list, int number) {
        String longestWord = list.get(number);
            return longestWord;
    }
}

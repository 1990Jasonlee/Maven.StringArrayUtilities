package com.zipcodewilmington;

import org.junit.Assert;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String num : array) {
            if (num.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
//        List<String> list = Arrays.asList(array);
//        Collections.reverse(list);
//        String[] reverse = list.toArray(array);
//        return reverse;
        String[] reverse = new String[array.length];
        for (int i = 0; i <= array.length/2 ; i++) {
            reverse[i] =array[array.length - i - 1];
            reverse[reverse.length - i - 1] = array[i];
        }
        return reverse;
    }
        // get middle point of string
        // swap first and last word on each end, repeat towards to middle letter of string

        /**
         * @param array array of String objects
         * @return true if the order of the array is the same backwards and forwards
         */ // TODO
        public static boolean isPalindromic (String[]array){

            return Arrays.equals(array, reverse(array));
        }

        /**
         * @param array array of String objects
         * @return true if each letter in the alphabet has been used in the array
         */ // TODO
        public static boolean isPangramic (String[]array){
            boolean isPangramic = false;
            int count = 0;
            String arr = Arrays.toString(array).toLowerCase();
            String alpha = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < alpha.length(); i++) {
                for (int j = 0; j < arr.length(); j++) {
                    if (alpha.charAt(i) == arr.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }
                if (count == 26){
                    isPangramic = true;
                }
            return isPangramic;
        }



        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return number of occurrences the specified `value` has occurred
         */ // TODO
        public static int getNumberOfOccurrences (String[]array, String value){
            int occurance = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i].equals(value)){
                    occurance++;
                }
            }
            return occurance;
        }

        /**
         * @param array         array of String objects
         * @param valueToRemove value to remove from array
         * @return array with identical contents excluding values of `value`
         */ // TODO
        public static String[] removeValue (String[]array, String valueToRemove){
            String[] arr;
            int count = 0;
            int newIndex= 0;
            for (int i = 0; i < array.length; i++){
                if(array[i].equals(valueToRemove)){
                    count++;
                }
            }
            arr = new String[array.length - count];
            for (int i = 0; i < array.length; i++)
            if (!array[i].equals(valueToRemove)) {
                arr[newIndex] = array[i];
                newIndex++;
        }
            return arr;
    }


        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO

        public static String[] removeConsecutiveDuplicates (String[]array){
            String[] arr;
            int count = 0;
            int newIndex= 0;
            String duplicate = "";

            for (int i = 0; i < array.length; i++){
                if(!array[i].equals(duplicate)) {
                    duplicate = array[i];
                }
                 else count++;
                 // count number of consecutive duplicates
                }

            arr = new String[array.length - count];
            for (int i = 0; i < array.length; i++)
            if (!array[i].equals(duplicate)) {
                arr[newIndex] = array[i];
                duplicate = array[i];
                newIndex++;
        }       // new array with no duplicates
            return arr;
    }


        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        //String[] array = {"a", "a", "a", "b", "c", "c", "a", "a", "d"};
        //String[] expected = {"aaa", "b", "cc", "aa", "d"};
        public static String[] packConsecutiveDuplicates (String[]array){
            String arr = ""; // aaa b c c aa d
            int count = 0;
            for (int i = 0; i < array.length-1; i++){
                if (array[i] !=array[i+1]) {
                    arr += array[i] + " ";
                } else
                { arr += array[i];
                    }
                //find duplicate and group
                }
            arr += array[array.length-1];
            for (int i = 0; i < arr.length(); i++){
                if (arr.charAt(i) == ' '){
                    count++;
                }
            }
            //find number of grouping
            count++;
            String[] newArray = arr.split(" ", count++);
            return newArray;
        }

    }

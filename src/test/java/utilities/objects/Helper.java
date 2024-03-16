package utilities.objects;

import java.util.*;

/*********************************************************************************************************************
 ** This object class is utilized to contain simple methods that process data, such as arrays, strings, lists, etc.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public class Helper {

    /*********************************************************************************************************************
     ** These methods handle the conversion of a string array into a string, separated by a space.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String toString(String[] array) {
        try {
            return String.join(" ", array);
        } catch (Exception e) {
            Printer.printError("Failed to convert a string array to a string");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the conversion of an integer array into a string, separated by a space.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String toString(int[] array) {
        try {
            StringBuilder result = new StringBuilder();
            for (int value : array) result.append(value).append(" ");
            return result.toString().trim();
        } catch (Exception e) {
            Printer.printError("Failed to convert an integer array to a string");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the conversion of a string into an integer array, splitting it by a space.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static int[] toIntegerArray(String input, String delimiter) {
        try {
            String[] parts = input.split(delimiter);
            int[] result = new int[parts.length];
            for (int i = 0; i < parts.length; i++) result[i] = Integer.parseInt(parts[i].trim());
            return result;
        } catch (Exception e) {
            Printer.printError("Failed to convert a string to an integer array");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the conversion of a list of objects to a string array.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String[] toStringArray(List<?> list) {
        try {
            String[] result = new String[list.size()];
            for (int i = 0; i < list.size(); i++) result[i] = String.valueOf(list.get(i));
            return result;
        } catch (Exception e) {
            Printer.printError("Failed to convert a list of objects to a string array");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the conversion of a string to a list of integers, separated by a space.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static List<Integer> toIntegerList(String input, String delimiter) {
        try {
            String[] parts = input.split(delimiter);
            List<Integer> result = new ArrayList<>();
            for (String part : parts) result.add(Integer.parseInt(part.trim()));
            return result;
        } catch (Exception e) {
            Printer.printError("Failed to convert a string to a list of integers");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the process of checking if there is an equal string for each string in the array.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean find(String text, String[] array) {
        try {
            for (String str : array) if (Objects.equals(text, str)) return true;
            return false;
        } catch (Exception e) {
            Printer.printError("Failed to find a string from a string array");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the process of checking if there is an equal number for each integer in the array.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean find(int num, int[] array) {
        try {
            for (int i : array) if (i == num) return true;
            return false;
        } catch (Exception e) {
            Printer.printError("Failed to find a number from an integer array");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the process of checking if there is an equal string for each string in the list.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean find(String text, List<String> array) {
        try {
            for (String str : array) if (Objects.equals(text, str)) return true;
            return false;
        } catch (Exception e) {
            Printer.printError("Failed to find a string from a string list");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the process of checking if each string in the array contains a specified string.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean contains(String text, String[] array) {
        try {
            for (String str : array) if (str.contains(text)) return true;
            return false;
        } catch (Exception e) {
            Printer.printError("Failed to check if one of the string array contains a specific text");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the process of checking if two arrays have similar string collections.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean isEqual(String[] array1, String[] array2) {
        try {
            if (array1 == null && array2 == null) return true;
            if (array1 == null || array2 == null) return false;
            if (array1.length != array2.length) return false;
            Arrays.sort(array1);
            Arrays.sort(array2);
            for (int i = 0; i < array1.length; i++) if (!array1[i].equals(array2[i])) return false;
            return true;
        } catch (Exception e) {
            Printer.printError("Failed to check if two string arrays are equal");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the process of checking if two arrays have similar integer collections.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean isEqual(int[] array1, int[] array2) {
        try {
            if (array1 == null && array2 == null) return true;
            if (array1 == null || array2 == null) return false;
            if (array1.length != array2.length) return false;
            Arrays.sort(array1);
            Arrays.sort(array2);
            for (int i = 0; i < array1.length; i++) if (array1[i] == array2[i]) return false;
            return true;
        } catch (Exception e) {
            Printer.printError("Failed to check if two integer arrays are equal");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the removal of a specified integer from the integer array.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static int[] removeFromArray(int num, int[] array) {
        try {
            return Arrays.stream(array)
                    .filter(value -> value != num)
                    .toArray();
        } catch (Exception e) {
            Printer.printError("Failed to remove a number from an integer array");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the retrieval of the index of a specified integer from the integer array.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static int getIndex(int num, int[] array) {
        try {
            for (int i = 0; i < array.length; i++) if (num == array[i]) return i;
            return -1;
        } catch (Exception e) {
            Printer.printError("Failed to get an index from an integer array");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the retrieval of the first character from the string.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getFirstChar(String text) {
        try {
            return String.valueOf(text.charAt(0));
        } catch (Exception e) {
            Printer.printError("Failed to get a first character from an string");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the retrieval of the last character from the string.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getLastChar(String text) {
        try {
            return String.valueOf(text.charAt(text.length() - 1));
        } catch (Exception e) {
            Printer.printError("Failed to get a last character from an string");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** These methods handle the reversal of an integer array.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static int[] reverseArray(int[] array) {
        List<Integer> numbersList = new ArrayList<>();
        for (int num : array) numbersList.add(num);
        Collections.reverse(numbersList);
        return numbersList.stream().mapToInt(Integer::intValue).toArray();
    }

    /*********************************************************************************************************************
     ** These methods handle the summation of an integer array.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) total += num;
        return total;
    }

}

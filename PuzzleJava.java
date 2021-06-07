import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;


public class PuzzleJava {


  public static ArrayList<Integer> sumAndGreaterThan10(int[] x) {
    int sum = 0;
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    for (int i = 0; i < x.length; i++) {
      sum += x[i];
      if (x[i] > 10) {
        newArr.add(x[i]);
      }
    }
    System.out.println("The sum of all the numbers is: " + sum);
    return newArr;
  }


  public static ArrayList<String> shuffleNames(String[] x) {
    ArrayList<String> newArr = new ArrayList<String>();
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < x.length; i++) {
      if (x[i].length() > 5) {
        result.add(x[i]);
      }
      newArr.add(x[i]);
    }
    Collections.shuffle(newArr);
    System.out.println(newArr);
    return result;
  }


  public static void shuffleAlphabet() {
    ArrayList<Character> newArr = new ArrayList<Character>();
    for (char letter = 'A'; letter <= 'Z'; letter++) {
      newArr.add(letter);
    }
    Collections.shuffle(newArr);
    System.out.println(newArr);

    System.out.println("Last letter of shuffled array: " + newArr.get(25));
    char firstLetter = newArr.get(0);
    System.out.println("First letter of shuffled array: " + firstLetter);
    if ("AEIOU".indexOf(firstLetter) >= 0) System.out.println("First letter is a vowel.");
  }


  public static int[] randomNums() {
    int[] newArr = new int[10];
    Random r = new Random();
    for (int i = 0; i < newArr.length; i++) {
      newArr[i] = r.nextInt(100-55) + 55;
    }
    return newArr;
  }


  public static void randomNumsSorted() {
    int[] newArr = randomNums();
    ArrayList<Integer> newArrList = new ArrayList<Integer>();
    for (int i = 0; i < newArr.length; i++) {
      newArrList.add(newArr[i]);
    }
    Collections.sort(newArrList);
    System.out.println(newArrList);

    System.out.println("Minimum value: " + newArrList.get(0));
    System.out.println("Maximum value: " + newArrList.get(9));
  }


  public static String randomString() {
    ArrayList<Character> newArr = new ArrayList<Character>();
    String newString = "";
    for (char letter = 'A'; letter <= 'Z'; letter++) {
      newArr.add(letter);
    }
    Collections.shuffle(newArr);
    for (int i = 0; i < 5; i++) {
      newString += newArr.get(i);
    }
    return newString;
  }


  public static void arrayOfRandomStrings() {
    String[] newArr = new String[10];
    for (int i = 0; i < 10; i++) {
      newArr[i] = randomString();
    }
    System.out.println(Arrays.toString(newArr));
  }
  public static void main(String[] args) {


    // Print the sum of all the numbers in the array
    // Create a new array with the values which are greater than 10
    int[] arr1 = {3, 5, 1, 2, 7, 9, 8, 13,25, 32};
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    arr2 = sumAndGreaterThan10(arr1);
    System.out.println(arr2);
    System.out.println();


    // Shuffle the array and print it
    // Create a new array with the names that are longer than 5 characters
    String[] arr3 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    ArrayList<String> arr4 = new ArrayList<String>();
    arr4 = shuffleNames(arr3);
    System.out.println(arr4);
    System.out.println();


    // Shuffle the array and display the last letter
    // Display the first letter of the array
    // If the first letter is a vowel, display a message.
    shuffleAlphabet();
    System.out.println();


    // Generate and return an array with 10 random numbers between 55-100
    int[] arr5 = randomNums();
    System.out.println(Arrays.toString(arr5));
    System.out.println();


    // Generate and return an array with 10 random numbers between 55-100
    // Have the array be sorted
    // Display all the numbers in the array, then the min and max values
    randomNumsSorted();
    System.out.println();


    // Create a random string that is 5 characters long
    System.out.println("Random String: " + randomString());


    // Create an array with 10 random strings that are each 5 characters long
    arrayOfRandomStrings();
  }
}
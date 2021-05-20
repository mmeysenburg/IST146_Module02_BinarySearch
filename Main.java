import java.util.*;

/**
 * Class with the BinarySearch demonstration's main method. 
 */
public class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored by this app. 
   */
  public static void main(String[] args) {
    // create array and fill with random values
    Random prng = new Random();
    int[] arr = new int[16];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = prng.nextInt(100);
    }

    // sort the array
    // java.util.Arrays has a built-in sort method!
    Arrays.sort(arr);

    // prompt user to search for values
    Scanner stdin = new Scanner(System.in);
    BinarySearch bs = new BinarySearch();

    System.out.println("Array:");
    System.out.println(Arrays.toString(arr));
    System.out.print("Enter key (neg. to quit): ");
    int key = stdin.nextInt();
    while(key >= 0) {
      // search for the key
      int pos = bs.binarySearch(arr, key);

      // output results
      if(pos < 0) {
        System.out.printf("%d not found.\n", key);
      } else {
        System.out.printf("%d found at index %d.\n", key, pos);
      }

      // get next key to search for
      System.out.println("Array:");
      System.out.println(Arrays.toString(arr));
      System.out.print("Enter key (neg. to quit): ");
      key = stdin.nextInt();
    } // while
  } // main method
} // Main class
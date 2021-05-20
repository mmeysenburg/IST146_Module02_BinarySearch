/**
 * Class encapsulating a BinarySearch algorithm.
 */
public class BinarySearch {
  /**
   * Perform BinarySearch on an integer array.
   * 
   * @param arr Integer array to search.
   * @param key Integer to search arr for.
   * @return An index where key is found in arr, or -1 if key
   * is not in arr.
   */
  public int binarySearch(int[] arr, int key) {
    int lIdx = 0, rIdx = arr.length - 1;
    
    while(lIdx <= rIdx) {
      int mIdx = (lIdx + rIdx) / 2;
      if(key == arr[mIdx]) {
        // found it!
        return mIdx;
      } else if(key < arr[mIdx]) {
        // go left
        rIdx = mIdx - 1;
      } else {
        // go right
        lIdx = mIdx + 1;
      }
    } // while

    // not found
    return -1;
  }
}
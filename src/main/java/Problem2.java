import java.util.*;
import java.util.Collections;

public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences: The algorithm converts the array
    given in the parameter into an arraylist so that the algorithm can remove values from
    the original array. The algorithm then adds the values of the arraylist back to the array
    and then returns the length of the arraylist.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            numsList.add(nums[i]);
        }
        for (int j = 0; j < numsList.size() - 1; j++) {
            if (numsList.get(j).equals(numsList.get(j + 1))) {
                numsList.remove(j);
                j--;
            }
        }
        for (int k = 0; k < numsList.size(); k++) {
            nums[k] = numsList.get(k);
        }
        return numsList.size();
    }
}

public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences: The loop goes through the entire array
    looking for if nums[i] > nums[i + 1]. If this statement is true then the loop swaps those
    two values using the placeholder variable and then goes back to the start of the array to repeat.
    Once the loop reaches the end of the array successfully then the loop should be sorted.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int placeholder1;
        int placeholder2;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] > nums[i + 1]) {
                placeholder1 = nums[i];
                placeholder2 = nums[i + 1];
                nums[i] = placeholder2;
                nums[i + 1] = placeholder1;
                i = 0;
            } else {
                i++;
            }
        }
    }
}

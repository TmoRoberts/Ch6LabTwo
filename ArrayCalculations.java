
/**
 * Write a description of class ArrayCalculations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayCalculations
{
    public static double averageArray(int[][] nums) {
        double sum = 0;
        double average = 0;
        for(int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                sum += nums[row][col];
            }
        }
        average = sum/(nums.length * nums[0].length);
        return average;
    }
    public static int[] sumColumns(int[][] nums) {
        int[] arr = new int[nums[0].length];
        for(int col = 0; col < nums[0].length; col++) {
          int sum = 0;
          for(int row = 0; row < nums.length; row++) {
            sum += nums[row][col];  
          }
          arr[col] = sum;
        }
        return arr; 
    }
    public static int[][] squareArray(int[][] nums) {
        int[][] arr = new int[nums.length][nums[0].length];
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                arr[row][col] = (nums[row][col])*(nums[row][col]);
            }
        }
        return arr;
    }
    public static void printArray(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                System.out.println(nums[row][col]);
            }
        }
    }
}
import java.util.Scanner;
public class TwoSum {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        TwoSum sol = new TwoSum();
        int[] result = sol.twoSum(nums, target);
        
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        }
        
        scanner.close();
    }
     public int[] twoSum(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[]{};
    }
    }

   


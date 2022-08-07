import java.util.*;

class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
       }

        

        public static void main(String[] args){
        	Scanner in = new Scanner(System.in);
        	int n, target, i;
        	
        	System.out.println("Enter the number of elements in the array");
        	n= in.nextInt();
        	int[] nums = new int[n];
 			
 			System.out.println("Enter the elements of the array");
 			for(i=0; i<n; i++)
 				nums[i]= in.nextInt();

 			System.out.println("Enter the target:");
 			target = in.nextInt();

 			int[] result = twoSum(nums, target);
 			System.out.println("Output:["+result[0]+ ", " + result[1]+"]");
        }
    } 

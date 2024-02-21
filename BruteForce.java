    
class BruteForce {

    public static int[] twoSum(int[] nums, int target){
        
        for(int i=0;i<(nums.length)-1;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

        // Define the array of numbers and the target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and get the result
        int[] result = BruteForce.twoSum(nums, target);

        // Print out the indices
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

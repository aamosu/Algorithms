import java.util.*;
public class OnePass {

        public static int[] twoSum(int[] nums, int target){
            
            Hashtable<Integer,Integer> ht1 = new Hashtable<> ();

            for(int i=0; i<nums.length; i++){
    
                int complement =target -nums[i];
    
                //.get() get value (index in this setup)
                // containsKey() checks key presense aka val in hastable for this setup 
                if(ht1.containsKey(complement)){
                    return new int[] {ht1.get(complement),i}; 
                }
                ht1.put(nums[i],i);
            }
    
            return new int[]{};
        }
        public static void main(String[] args) {
    
            // Define the array of numbers and the target
            int[] nums = {2, 7, 11, 15};
            int target = 9;
    
            // Call the twoSum method and get the result
            int[] result = OnePass.twoSum(nums, target);
    
            // Print out the indices
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
      
}

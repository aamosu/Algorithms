import java.util.*;


class HashTableTwoSums {

    public static  int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> ht1 = new Hashtable<> ();

        for(int j=0; j<nums.length; j++){
            //index must be second since it is the value returuned a
            ht1.put(nums[j],j);
        }

        for(int i=0; i<nums.length; i++){

            int complement =target -nums[i];

            //.get() get value (index in this setup)
            // containsKey() checks key presense aka val in hastable for this setup 
            if(ht1.containsKey(complement) && ht1.get(complement) !=i){
                return new int[] {i, ht1.get(complement)}; 
            }
            
        }

        return new int[]{};

        
    }
    public static void main(String[] args) {

        // Define the array of numbers and the target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and get the result
        int[] result = HashTableTwoSums.twoSum(nums, target);

        // Print out the indices
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

    

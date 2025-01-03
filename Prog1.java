//The program solves the Two Sum Problem

import java.util.HashMap;
import java.util.Map;

public class Prog1 {
    
    public static int[] twoSum( int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            map.put(nums[i], i);        //Iterate through the nums array, adding each number as a key and its index as the value to the map.
        }
        for(int i=0; i< nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No tow sum solution");  //If no valid pair is found, the method throws an exception.

    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 91;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", "+ result[1]);
    }
}

import java.util.*;
public class Majority_element_two {
    public static int majorityElement(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>nums.length/2)
                ans=key;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr ={2,2,1,1,1,2,2};
        int ans= majorityElement(arr);
        System.out.println(ans);
    }
}

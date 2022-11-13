import java.util.*;
public class two_sum {
    public static ArrayList<Integer> two__sum(int[]arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
      ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum=target-arr[i];
            if (map.containsKey(sum)){
                result.add(map.get(sum));
                result.add(i);
                return result;
            }
            map.put(arr[i],i);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr={2,3,1,4};
        int target = 4;
        System.out.println(two__sum(arr,target));
    }
}

package Arrays;

import java.util.*;

public class twoSum {
  // Given a no., find indices of the elements in the array that adds upto
  // the no.

  // Brute force
  // public int[] brute(int arr[],int x){
  // int n=arr.length;
  // for(int i=0;i<n;i++){
  // for(int j=0;j<n-1;j++){
  // if(arr[i]+arr[j]==x)
  // return new int[]{i,j};
  // }
  // }
  // Using HashMap - Optimised- O(n)
  public int[] opti(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int rem = target - nums[i];
      if (map.containsKey(rem)) {
        return new int[] { i, map.get(rem) };
      }
      map.put(nums[i], i);

    }
    return new int[] {};
  }
  // }

  // 1. Brute force
  // public int[] twoS(int arr[],int x){

  // for(int i=0;i<arr.length;i++){

  // }
  // }

}

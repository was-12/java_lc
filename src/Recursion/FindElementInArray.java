package Recursion;

import java.util.ArrayList;

public class FindElementInArray {
    //finding  an element in an array
    public boolean find(int target, int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }
        return nums[index] == target || find(target, nums, index + 1);

    }

    //checking if an array is sorted or not
    public boolean isSorted(int nums[], int index) {

        if (index == nums.length - 1) {
            return true;
        }

        return nums[index] < nums[index + 1] && isSorted(nums, index + 1);
    }

    public ArrayList<Integer> findInList(int target, int[] nums, int index, ArrayList<Integer> list) {
        // Base case
        if (index == nums.length) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }

        return findInList(target, nums, index + 1, list);
    }




    public static void main(String[] args) {

        FindElementInArray it=new FindElementInArray();
  //      System.out.println(it.find(2,new int[]{1,2,3,4},2));
    //    System.out.println(it.find(2,new int[]{1,2,3,4,5,6,7,8,9,10},2));
      //  System.out.println(it.findInList(3,new int[]{1,2,3,4,3,3,3,5,6,7,8,9,10},1));
        System.out.println(it.isSorted(new int[]{1,2,3,4,5,6,7,8,9,10},2));
    }



}
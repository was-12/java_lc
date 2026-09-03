package Arrays;

public class ShiftElementsByPosition {
public static void shiftElements(int []nums){

    int temp=nums[nums.length-1];
    for(int i=nums.length-1;i>0;i--){
        nums[i]=nums[i-1];
    }
    nums[0]=temp;
for(int i=0;i<nums.length;i++){
    System.out.println(nums[i]);
}
}

    public static void main(String[] args) {
        shiftElements(new int[]{1,2,3,4,5});
    }


}

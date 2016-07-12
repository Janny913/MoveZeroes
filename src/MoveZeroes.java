/**
 * Created by jianiyang on 16/7/11.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums){
        if (nums == null || nums.length==0)
            return;
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }

        }
        for (int k = j; k < nums.length; k++){
            nums[k] = 0;
        }
        return;


    }

    public static void main(String[] args){
        int[] input = {1,3,2,0,1,0};
        MoveZeroes testResult = new MoveZeroes();
        testResult.moveZeroes(input);
        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }

}

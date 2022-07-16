import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length << 1;
        int[] res = new int[length];
        System.arraycopy(nums, 0, res, 0, nums.length);
        System.arraycopy(nums, 0, res, nums.length,nums.length);
        return res;
    }
}

// https://leetcode.com/problems/reverse-integer/submissions/
import java.lang.Math;
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(57657690));
    }
    public static int reverse(int x) {
        int rev = 0;
        int sign = Integer.signum(x);
        int abs = Math.abs(x);
        while (abs >0){
            int rem = abs % 10;
            int rvv = rev * 10 + rem;
            if((rvv-rem)/10 != rev) return 0; // for checking overflow
            rev = rvv;
            abs = (int)abs/10;
        }
        
        return rev*sign;
    }
}

/*
 * 
 * There's no need for any data type other than int. Just make sure when there's an operation that increases a number, reversing the operation should give you the previous number. Otherwise, there's overflow.

public int reverse(int x) {
    int y = 0;

    while(x != 0) {
        int yy = y*10 + x%10;

        if ((yy - x%10)/10 != y) return 0;
        else y = yy;

        x = x/10;   
    }
    return y;
}
 * 
 * 
 * 
 * Above most of the answers having a trivial problem is that the int variable possibly might overflow. You can try this : x = -2147483648 as parameter. There has an easy way to solve the problem. Convert x to long, and check if the result >= Integer.MAX_VALUE, otherwise return 0. The solution passed all test cases on https://leetcode.com/problems/reverse-integer/

This is a java version.

public int reverse(int x) {
        long k = x;
        boolean isNegtive = false;        
        if(k < 0){
            k = 0 - k;
            isNegtive = true;
        }

        long result = 0;
        while(k != 0){
            result *= 10;
            result += k % 10;
            k /= 10;
        }

        if(result > Integer.MAX_VALUE) return 0;
        return isNegtive  ? 0 - ((int)result) : (int)result;
    }
 */

package leet_code.product_of_array_except_self238;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = new int[]{-3,-1,0,1,3};

        int[] answer = solution.productExceptSelfNumsAsPrefix(arr);

        System.out.println(Arrays.toString(answer));
    }
}

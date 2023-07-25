package tasks;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = new int[2];
        boolean condition = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    condition = true;
                    break;
                }
            }
            if(condition) break;
        }

        System.out.println("result = " + Arrays.toString(result));


    }
}
